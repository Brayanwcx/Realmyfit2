let menuVisible = false;
//Función que oculta o muestra el menu
function mostrarOcultarMenu(){
    if(menuVisible){
        document.getElementById("nav").classList ="";
        menuVisible = false;
    }else{
        document.getElementById("nav").classList ="responsive";
        menuVisible = true;
    }
}
function seleccionar(){
    //oculto el menu una vez que selecciono una opcion
    document.getElementById("nav").classList = "";
    menuVisible = false;
}
document.addEventListener('DOMContentLoaded', function() {
    // Configuración inicial
    const cards = document.querySelectorAll('.membership-card');
    const buttons = document.querySelectorAll('.buy-button');
    
    
    // Interacción con botones
    buttons.forEach(button => {
        button.addEventListener('mouseenter', function() {
            this.style.transform = 'scale(1.02)';
            this.querySelector('::after').style.opacity = '1';
        });
        
        button.addEventListener('mouseleave', function() {
            this.style.transform = 'scale(1)';
            this.querySelector('::after').style.opacity = '0';
        });
        
        button.addEventListener('click', function() {
            const card = this.closest('.membership-card');
            const planName = card.querySelector('.duration').textContent;
            const price = card.querySelector('.price-discounted').textContent;
            
            // Animación de confirmación
            this.textContent = '✓ COMPRADO';
            this.style.background = '#2ecc71';
            
            setTimeout(() => {
                alert(`¡Has seleccionado el plan ${planName} por ${price}!`);
                this.textContent = 'COMPRAR AHORA';
                this.style.background = '';
            }, 1000);
        });
    });
    
    // Efecto parallax para el fondo
    window.addEventListener('scroll', function() {
        const scrollPosition = window.pageYOffset;
        document.body.style.backgroundPositionY = `${scrollPosition * 0.5}px`;
    });
    //efectos cuidados//
    // Filtrado de Productos
document.querySelectorAll('.filter-btn').forEach(btn => {
    btn.addEventListener('click', function() {
        // Remover clase active de todos los botones
        document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
        
        // Añadir clase active al botón clickeado
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
// Botón volver arriba
const backToTopBtn = document.getElementById('backToTop');

if (backToTopBtn) {
  window.addEventListener('scroll', () => {
    if (window.pageYOffset > 300) {
      backToTopBtn.classList.add('visible');
    } else {
      backToTopBtn.classList.remove('visible');
    }
  });

  backToTopBtn.addEventListener('click', () => {
    window.scrollTo({
      top: 0,
      behavior: 'smooth'
    });
  });
}


// Efecto hover para tarjetas
document.querySelectorAll('.product-card').forEach(card => {
    card.addEventListener('mouseenter', () => {
        card.querySelector('.product-img').style.transform = 'scale(1.05)';
    });
    
    card.addEventListener('mouseleave', () => {
        card.querySelector('.product-img').style.transform = 'scale(1)';
    });
});

// Animación de agregar al carrito
document.querySelectorAll('.add-to-cart').forEach(btn => {
    btn.addEventListener('click', function(e) {
        e.stopPropagation();
        const product = this.closest('.product-card');
        const productName = product.querySelector('h3').textContent;
        
        // Efecto visual
        this.textContent = '✓ Agregado';
        this.style.background = '#2ecc71';
        
        // Reset después de 2 segundos
        setTimeout(() => {
            this.innerHTML = '+ Carrito';
            this.style.background = '#ab67e8';
        }, 2000);
        
        // Aquí iría la lógica real del carrito
        console.log(`Producto agregado: ${productName}`);
    });
});
});