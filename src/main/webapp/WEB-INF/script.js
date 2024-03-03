// Datos de ejemplo (puedes cargarlos desde el servidor)
const users = [
    { id: 1, nombre: "Juan", apellido: "Pérez" },
    { id: 2, nombre: "María", apellido: "Gómez" },
    // Agrega más usuarios según tus datos
];

// Función para mostrar alerta con el ID al hacer clic en una fila
function showUserId(id) {
    alert("ID de usuario seleccionado: " + id);
}

// Función para ordenar la tabla por columna
function sortTable(columnIndex) {
    // Lógica de ordenamiento (puedes usar una biblioteca como Lodash)
    // ...

    // Mostrar alerta indicando la columna por la que se ordena
    alert("Ordenando por la columna " + columnIndex);
}

// Función para filtrar la tabla por el contenido del input
function filterTable() {
    const filterInput = document.getElementById("filterInput").value.toLowerCase();

    // Lógica de filtrado (puedes usar una biblioteca como Lodash)
    // ...

    // Mostrar alerta indicando que se está filtrando
    alert("Filtrando por: " + filterInput);
}

// Función para cargar los datos en la tabla al cargar la página
function populateTable() {
    const tableBody = document.querySelector("#userTable tbody");

    // Limpiar contenido actual de la tabla
    tableBody.innerHTML = "";

    // Crear filas con datos de usuarios
    users.forEach(user => {
        const row = document.createElement("tr");

        // Agrega más celdas según tus datos
        const cells = [
            document.createElement("td"),
            document.createElement("td"),
            // Agrega más celdas según tus datos
        ];

        // Configurar el contenido de las celdas
        cells[0].textContent = user.nombre;
        cells[1].textContent = user.apellido;
        // Configura más contenido según tus datos

        // Agregar evento clic a la fila para mostrar el ID al hacer clic
        row.addEventListener("click", () => showUserId(user.id));

        // Agregar celdas a la fila
        cells.forEach(cell => row.appendChild(cell));

        // Agregar fila a la tabla
        tableBody.appendChild(row);
    });
}

// Llamar a la función para cargar datos en la tabla al cargar la página
populateTable();/**
 * 
 */