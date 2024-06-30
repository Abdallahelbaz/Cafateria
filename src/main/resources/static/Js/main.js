let header = document.querySelector('header');
window.addEventListener('scroll', ()=>{
    header.classList.toggle('shadow',window.scrollY>0)
})
document.addEventListener("DOMContentLoaded", function () {
    const cart = JSON.parse(localStorage.getItem("cart")) || [];

    document.querySelectorAll(".add-to-cart").forEach(button => {
        button.addEventListener("click", function (event) {
            event.preventDefault();
            const price = parseFloat(this.getAttribute("data-price"));
            const name = this.closest(".box").querySelector("h3").innerText;

            cart.push({ name, price });
            localStorage.setItem("cart", JSON.stringify(cart));
            alert(`${name} added to cart.`);
        });
    });

    // Update checkout page if on checkout page
    if (window.location.pathname.includes("checkout.html")) {
        const orderSummary = document.querySelector(".order-summary");
        const totalElement = document.createElement("p");
        let total = 0;

        cart.forEach(item => {
            const itemElement = document.createElement("p");
            itemElement.innerText = `${item.name}: $${item.price}`;
            orderSummary.appendChild(itemElement);
            total += item.price;
        });

        totalElement.innerText = `Total: $${total}`;
        orderSummary.appendChild(totalElement);
    }
});
