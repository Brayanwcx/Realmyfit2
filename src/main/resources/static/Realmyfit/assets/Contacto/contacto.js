     document.querySelectorAll('.form-group input, .form-group textarea').forEach(element => {
            element.addEventListener('focus', function() {
                this.parentNode.classList.add('focused');
            });
            
            element.addEventListener('blur', function() {
                if(this.value === '') {
                    this.parentNode.classList.remove('focused');
                }
            });
            
            // Activar estado focused si ya tiene valor
            if(element.value !== '') {
                element.parentNode.classList.add('focused');
            }
        });