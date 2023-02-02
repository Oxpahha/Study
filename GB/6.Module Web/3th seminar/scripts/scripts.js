function clock() {
    let d = new Date();
    return (document.getElementById('d1').innerHTML = "Today's date is " + d);
}
function ageCheck() {
    let age = parseInt(prompt('Enter age'));

    if (age == 18) {
        alert('Вы совершеннолетний, все можно!');
    } else if (1 <= age && age <= 17) {
        alert('Вам надо учить уроки!');
    } else if (age >= 19) {
        alert('Ложитесь спать, завтра на работу');
    } else {
        alert('Мы не знаем что Вам делать');
    }

    // switch (age) {
    //     case 18:
    //         alert('Вы совершеннолетний, все можно!');
    //         break;
    //     case 17:
    //         alert('Вам надо учить уроки!');
    //         break;            
    //     case 19:
    //         alert('Ложитесь спать, завтра на работу');
    //         break;             
    //     default:
    //         alert('Мы не знаем что Вам делать');
    //         break;
    // }
}
function named() {
    let name = prompt('Whats ur name?', 'Anon');
    if (name) {
        alert(`Hello, ${name}`);
    } else {
        alert('Ok. No names');
    }

}