import { Link, useParams } from "react-router-dom"

function BemVindo(props) {

    const params = useParams()

    return (
        <>
            <h1>Olá, {params.usuario}</h1>
            <Link to='/tarefas'>Tarefas</Link>
        </>
    )
}

export default BemVindo