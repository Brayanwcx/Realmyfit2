document.addEventListener('DOMContentLoaded', function() {
  // Toggle sidebar
  document.getElementById('sidebarCollapse').addEventListener('click', function() {
    document.getElementById('sidebar').classList.toggle('active');
  });


  const navLinks = document.querySelectorAll('#sidebar a[data-section]');
  const sectionContents = document.querySelectorAll('.section-content');

  navLinks.forEach(link => {
    link.addEventListener('click', function(e) {
      e.preventDefault();
      
    
      navLinks.forEach(navLink => {
        navLink.parentElement.classList.remove('active');
      });
      
  
      this.parentElement.classList.add('active');
      

      sectionContents.forEach(section => {
        section.classList.add('d-none');
      });
      
     
      const sectionId = this.getAttribute('data-section');
      document.getElementById(sectionId).classList.remove('d-none');
    });
  });

  // Mostrar dashboard por defecto
  document.querySelector('#sidebar a[data-section="dashboard"]').click();


});