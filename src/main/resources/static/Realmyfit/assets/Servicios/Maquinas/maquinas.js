
window.addEventListener('scroll', () => {
  document.querySelectorAll('.fade').forEach(section => {
    const rect = section.getBoundingClientRect();
    if (rect.top < window.innerHeight - 100) {
      section.classList.add('visible');
    }
  });
});


document.querySelectorAll('.star-rating').forEach(rating => {
  const stars = Array.from(rating.querySelectorAll('span'));
  stars.forEach((star, index) => {
    star.addEventListener('click', () => {
      stars.forEach(s => s.classList.remove('selected'));
      for (let i = 0; i <= index; i++) {
        stars[i].classList.add('selected');
      }
      alert(`¡Gracias por calificar a ${rating.dataset.trainer} con ${index + 1} estrellas!`);
    });
    star.addEventListener('mouseover', () => {
      stars.forEach(s => s.classList.remove('hover'));
      for (let i = 0; i <= index; i++) {
        stars[i].classList.add('hover');
      }
    });
    star.addEventListener('mouseout', () => {
      stars.forEach(s => s.classList.remove('hover'));
    });
  });
});

const maquinaCards = document.querySelectorAll('.maquina-card');

const mostrarCards = () => {
  const triggerBottom = window.innerHeight * 0.9;

  maquinaCards.forEach(card => {
    const cardTop = card.getBoundingClientRect().top;
    if(cardTop < triggerBottom) {
      card.style.opacity = 1;
      card.style.transform = 'translateY(0)';
    }
  });
};

window.addEventListener('scroll', mostrarCards);
window.addEventListener('load', mostrarCards);
const cards = document.querySelectorAll('.maquina-card');

cards.forEach(card => {
  card.addEventListener('click', () => {
    card.classList.add('active');

    setTimeout(() => {
      card.classList.remove('active');
    }, 400); 
  });
});
console.log("Página de inicio y eventos lista.");
document.querySelectorAll('.event-full').forEach(eventCard => {
  eventCard.addEventListener('click', () => {
    eventCard.classList.add('active');
    setTimeout(() => {
      eventCard.classList.remove('active');
    }, 500); 
  });
});

document.querySelectorAll('.detalles').forEach(btn => {
  btn.addEventListener('click', e => {
    e.stopPropagation();
    const details = btn.getAttribute('data-detalles');
    document.getElementById('modal-text').innerText = details;
    document.getElementById('modal').style.display = 'block';
  });
});


document.querySelector('.close').addEventListener('click', () => {
  document.getElementById('modal').style.display = 'none';
});


window.addEventListener('click', e => {
  const modal = document.getElementById('modal');
  if (e.target === modal) {
    modal.style.display = 'none';
  }
});

document.querySelectorAll('.detalles').forEach(btn => {
  btn.addEventListener('click', e => {
    e.stopPropagation();
    const details = btn.getAttribute('data-detalles');
    document.getElementById('modal-text').innerText = details;
    document.getElementById('modal').style.display = 'block';
  });
});


document.querySelectorAll('.inscribirse').forEach(btn => {
  btn.addEventListener('click', e => {
    e.stopPropagation();
    document.getElementById('modal-text').innerText = "✅ ¡Te has inscrito a nuestro evento!";
    document.getElementById('modal').style.display = 'block';
  });
});


document.querySelector('.close').addEventListener('click', () => {
  document.getElementById('modal').style.display = 'none';
});


window.addEventListener('click', e => {
  const modal = document.getElementById('modal');
  if (e.target === modal) {
    modal.style.display = 'none';
  }
});

const fadeElems = document.querySelectorAll('.event-card, .event-full');

window.addEventListener('scroll', () => {
  fadeElems.forEach(el => {
    const rect = el.getBoundingClientRect();
    if (rect.top <= window.innerHeight * 0.8) {
      el.classList.add('visible');
    }
  });
});

