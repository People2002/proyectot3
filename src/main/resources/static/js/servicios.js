(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarServicio");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            document.getElementById('id').value = item.dataset.id;
            document.getElementById('cboCategoriaServicios').value = item.dataset.categoriaServ;
            document.getElementById('txtNombre').value = item.dataset.nombre;
            document.getElementById('txtCosto').value = item.dataset.costo;
            new bootstrap.Modal(document.getElementById('modalEditar')).show();
        })
    })
})();