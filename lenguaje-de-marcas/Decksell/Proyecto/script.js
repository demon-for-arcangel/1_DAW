function seleccionarTipo(select) {
    if (select.value === "pokemon") {
      window.location.href = "venta-cartas1.html";
    } else if (select.value === "YuGiOh") {
      window.location.href = "venta-cartas2.html";
    }
  }