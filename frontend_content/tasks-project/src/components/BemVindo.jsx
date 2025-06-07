import axios from "axios"
import { Link, useParams } from "react-router-dom"

function BemVindo(props) {

    const params = useParams()

    function iniciar() {
        axios.get('http://localhost:8080/inicio')
        .then((resposta) => sucesso(resposta))
        .catch((erro) => falhou(erro))
        .finally(() => console.log('Finalizou a chamada'))
    }

    function sucesso(resposta) {
        console.log('Resposta: ' + resposta.data);
    }

    function falhou(erro) {
        console.log('Erro: ' + erro)
    }

    return (
        <>
            <h1>Olá, {params.usuario}</h1>
            <Link to='/tarefas'>Tarefas</Link>
            <button onClick={iniciar}>Bem-Vindo</button>
        </>
    )
}

export default BemVindo