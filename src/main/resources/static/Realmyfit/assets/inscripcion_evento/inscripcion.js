document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('.event-registration-form');
    
    if(form) {
        form.addEventListener('submit', function(e) {
            e.preventDefault();
            
            // Validación básica
            const nombre = document.getElementById('full-name').value;
            const email = document.getElementById('email').value;
            const telefono = document.getElementById('phone').value;
            const talla = document.getElementById('shirt-size').value;
            const terminos = document.querySelector('input[type="checkbox"]').checked;
            
            if(!nombre || !email || !telefono || !talla || !terminos) {
                alert('Por favor completa todos los campos obligatorios');
                return;
            }
            
            // Simular envío
            console.log('Datos del formulario:', {
                nombre,
                email,
                telefono,
                talla,
                notas: document.getElementById('medical-notes').value
            });
            
            // Mostrar confirmación
            alert('¡Inscripción exitosa! Hemos recibido tu información para el evento.');
            form.reset();
            
     
        });
    }
});