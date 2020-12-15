function doFilter(element) {
    let request = new XMLHttpRequest();
    request.open('POST', '/filter', true);
    request.setRequestHeader('Content-type', 'application/json');

    let objData = {};

    let fields = document.getElementsByClassName("formTag");
    console.log(fields);
    let withValue = [];
    for (let field of fields) {
        if (field.value.length > 0)
            withValue.push(field);
    }
    let form = document.createElement("form");
    form.setAttribute("method", "post");
    form.setAttribute("action", window.location.host + "/filter");
    console.log(form.getAttribute("action"));
    for (let formInput of withValue) {
        let input = document.createElement("input");
        input.setAttribute("name", formInput.name);
        input.setAttribute("value", formInput.value);
        form.appendChild(input);
        objData[formInput.name] = formInput.value;
    }


    fetch("/filter", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(objData)
    })
        .then(body => body.text())
        .then(html => {
            document.querySelector('body').innerHTML = html;
        })
}