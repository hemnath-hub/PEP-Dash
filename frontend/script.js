document.addEventListener("DOMContentLoaded", () => {
  fetch("/dashboard")
    .then(response => response.json())
    .then(data => {
      const display = document.getElementById("dataDisplay");
      display.innerHTML = `<pre>${JSON.stringify(data, null, 2)}</pre>`;
    })
    .catch(error => console.error("Error fetching data:", error));
});
