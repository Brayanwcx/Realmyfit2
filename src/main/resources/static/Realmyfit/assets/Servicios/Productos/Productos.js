// Filtrado de Productos
document.querySelectorAll('.filter-btn').forEach(btn => {
    btn.addEventListener('click', function() {
      
        document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
        
       
        this.classList.add('active');
        
        const category = this.dataset.category;
        const products = document.querySelectorAll('.product-card');
        
        products.forEach(product => {
            if (category === 'all' || product.dataset.category === category) {
                product.style.display = 'block';
                setTimeout(() => {
                    product.style.opacity = '1';
                    product.style.transform = 'translateY(0)';
                }, 50);
            } else {
                product.style.opacity = '0';
                product.style.transform = 'translateY(20px)';
                setTimeout(() => {
                    product.style.display = 'none';
                }, 300);
            }
        });
    });
});


document.querySelectorAll('.product-card').forEach(card => {
    card.addEventListener('mouseenter', () => {
        card.querySelector('.product-img').style.transform = 'scale(1.05)';
    });
    
    card.addEventListener('mouseleave', () => {
        card.querySelector('.product-img').style.transform = 'scale(1)';
    });
});
document.addEventListener('DOMContentLoaded', function() {
    console.log("DOM cargado"); 
    
    const cartIcon = document.getElementById('cartIcon');
    const cartModal = document.getElementById('cartModal');
    
    if (!cartIcon || !cartModal) {
        console.error("Error: No se encontró cartIcon o cartModal");
        return;
    }

    
    function openCart() {
        console.log("Intentando abrir carrito");
        cartModal.style.display = 'flex';
        setTimeout(() => {
            cartModal.classList.add('active');
        }, 10);
    }

    
    function closeCart() {
        cartModal.classList.remove('active');
        setTimeout(() => {
            cartModal.style.display = 'none';
        }, 300);
    }

  
    cartIcon.addEventListener('click', openCart);
    document.querySelector('.close-cart').addEventListener('click', closeCart);
    
    
    cartModal.addEventListener('click', function(e) {
        if (e.target === cartModal) {
            closeCart();
        }
        
    });

    console.log("Event listeners configurados");
    
});

let cart = [];
let cartTotal = 0;


document.addEventListener('DOMContentLoaded', function() {
    const cartIcon = document.getElementById('cartIcon');
const cartModal = document.getElementById('cartModal');
const cartItemsContainer = document.getElementById('cartItems');
const cartTotalElement = document.getElementById('cartTotal');
const closeCartBtn = document.querySelector('.close-cart');
const checkoutBtn = document.querySelector('.checkout-btn');
const paymentSection = document.getElementById('paymentSection');
const backToCartBtn = document.querySelector('.back-to-cart');
const paymentMethods = document.querySelectorAll('.payment-method');
const paymentForms = document.querySelectorAll('.payment-form');
const confirmPaymentBtn = document.querySelector('.confirm-payment');


document.querySelectorAll('.add-to-cart').forEach(button => {
    button.addEventListener('click', function() {
        const productCard = this.closest('.product-card');
        let priceText = productCard.querySelector('.price').textContent;
       
        priceText = priceText.replace(/[^0-9,\\.]/g, '');
        
        priceText = priceText.replace(',', '.');
        const price = parseFloat(priceText);
        const product = {
            id: productCard.dataset.id || Date.now().toString(),
            name: productCard.querySelector('h3').textContent,
            price: price,
            image: productCard.querySelector('.product-img').style.backgroundImage,
            quantity: 1
        };
        
        addToCart(product);
        updateCartUI();
        
       
        this.textContent = '✓ Agregado';
        this.style.background = '#2ecc71';
        
        setTimeout(() => {
            this.innerHTML = '+ Carrito';
            this.style.background = '#ab67e8';
        }, 2000);
    });
});

cartIcon.addEventListener('click', () => {
    cartModal.classList.add('active');
    document.body.style.overflow = 'hidden';
    document.body.classList.add('cart-open'); 
});

closeCartBtn.addEventListener('click', () => {
    cartModal.classList.remove('active');
    document.body.style.overflow = 'auto';
    document.body.classList.remove('cart-open'); 
});

checkoutBtn.addEventListener('click', () => {
    if (cart.length > 0) {
        cartModal.classList.remove('active');
        paymentSection.style.display = 'block';
        document.body.style.overflow = 'auto';
        document.body.classList.remove('cart-open'); 
    }
});

backToCartBtn.addEventListener('click', () => {
    paymentSection.style.display = 'none';
    cartModal.classList.add('active');
    document.body.classList.add('cart-open'); 
});

paymentMethods.forEach(method => {
    method.addEventListener('click', () => {
        paymentMethods.forEach(m => m.classList.remove('active'));
        method.classList.add('active');
        
        const methodName = method.dataset.method;
        paymentForms.forEach(form => form.classList.add('hidden'));
        document.getElementById(`${methodName}Form`).classList.remove('hidden');
    });
});

confirmPaymentBtn.addEventListener('click', () => {
    
    alert('¡Pago completado con éxito! Gracias por tu compra.');
    cart = [];
    updateCartUI();
    paymentSection.style.display = 'none';
    document.body.style.overflow = 'auto';
});


function addToCart(product) {
    const existingItem = cart.find(item => item.id === product.id);
    
    if (existingItem) {
        existingItem.quantity += 1;
    } else {
        cart.push(product);
    }
    
    calculateTotal();
}

function removeFromCart(productId) {
    cart = cart.filter(item => item.id !== productId);
    calculateTotal();
    updateCartUI();
}

function calculateTotal() {
    cartTotal = cart.reduce((total, item) => total + (item.price * item.quantity), 0);
}

function updateCartUI() {
 
    document.querySelector('.cart-count').textContent = cart.reduce((total, item) => total + item.quantity, 0);
    
  
    cartItemsContainer.innerHTML = '';
    
    if (cart.length === 0) {
        cartItemsContainer.innerHTML = '<p class="empty-cart">Tu carrito está vacío</p>';
        checkoutBtn.style.display = 'none';
    } else {
        checkoutBtn.style.display = 'block';
        cart.forEach(item => {
            const cartItemElement = document.createElement('div');
            cartItemElement.className = 'cart-item';
     
            const imageUrl = item.image.match(/url\("(.+)"\)/)[1];
           
            const subtotal = item.price * item.quantity;
            cartItemElement.innerHTML = `
                <img src="${imageUrl}" alt="Producto" class="cart-product-img">
                <div class="cart-item-details">
                    <h4 class="cart-item-title">${item.name}</h4>
                    <div class="cart-item-price">Precio: $${item.price.toLocaleString('es-CO')}</div>
                    <div class="cart-item-qty">Cantidad: ${item.quantity}</div>
                    <div class="cart-item-subtotal">Subtotal: $${subtotal.toLocaleString('es-CO')}</div>
                    <button class="remove-item" data-id="${item.id}" style="color: #e74c3c; background: none; border: none; cursor: pointer;">Eliminar</button>
                </div>
            `;
            cartItemsContainer.appendChild(cartItemElement);
        });
        
        
        document.querySelectorAll('.remove-item').forEach(btn => {
            btn.addEventListener('click', function() {
                removeFromCart(this.dataset.id);
            });
        });
    }
    
    
    cartTotalElement.textContent = `$${cartTotal.toLocaleString('es-CO')}`;
}
});
