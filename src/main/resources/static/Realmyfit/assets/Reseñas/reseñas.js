const form = document.getElementById('form-reseña');
const nuevasReseñas = document.getElementById('nuevas-reseñas');

form.addEventListener('submit', function(e) {
  e.preventDefault();

  const calificacion = document.getElementById('calificacion').value;
  const comentario = document.getElementById('nueva-reseña').value.trim();
  const autor = document.getElementById('autor-reseña').value.trim();

  if (calificacion && comentario && autor) {
    const nuevaReseña = document.createElement('div');
    nuevaReseña.classList.add('reseña');

    nuevaReseña.innerHTML = `
      <div class="estrellas">${calificacion}</div>
      <p class="comentario">"${comentario}"</p>
      <p class="autor">- ${autor}</p>
    `;

    nuevasReseñas.prepend(nuevaReseña);

    form.reset();
  } else {
    alert('Por favor, completa todos los campos.');
  }
});