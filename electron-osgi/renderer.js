const osgi = require('./build/Release/osgi');

osgi.sayHi().then((value) => {
    const p = document.createElement('p');
    p.innerText = value;
    document.body.appendChild(p);
});
