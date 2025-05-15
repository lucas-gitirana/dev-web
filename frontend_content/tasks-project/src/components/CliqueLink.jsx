
function CliqueLink() {

    function linkClicado(e) {
        e.preventDefault();
        console.log('Link clicado!');
    }

    return (
        <a href="#" onClick={linkClicado}>Clique Aqui</a>
    )
}

export default CliqueLink