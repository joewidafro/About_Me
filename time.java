// Function to display a greeting based on the time of day
function setGreeting() {
    const greetingElement = document.getElementById('greeting');
    const currentHour = new Date().getHours();

    if (currentHour >= 5 && currentHour < 12) {
        greetingElement.textContent = 'Good Morning, Joseph!';
    } else if (currentHour >= 12 && currentHour < 18) {
        greetingElement.textContent = 'Good Afternoon, Joseph!';
    } else if (currentHour >= 18 && currentHour < 22) {
        greetingElement.textContent = 'Good Evening, Joseph!';
    } else {
        greetingElement.textContent = 'Good Night, Joseph!';
    }
}

// Call the function to set the greeting on page load
window.onload = function() {
    setGreeting();
};