
(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarDoctor");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            document.getElementById('id').value = item.dataset.id;
            document.getElementById('cboEspecialidad').value = item.dataset.especialidad;
            document.getElementById('txtNombre').value = item.dataset.nombre;
            document.getElementById('txtEdad').value = item.dataset.edad;
            new bootstrap.Modal(document.getElementById('modalEditar')).show();
        })
    })
})();