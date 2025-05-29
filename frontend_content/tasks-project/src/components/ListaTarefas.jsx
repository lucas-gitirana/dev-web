export default function ListaTarefas() {
    const tarefas = [
        {id: 1, descricao: 'Aprender React', concluido: false},
        {id: 1, descricao: 'Aprender Rest APIs', concluido: false},
        {id: 1, descricao: 'Desenvolver uma aplicação', concluido: false},
    ]

    return (
        <div className="container">
            <h1>Tarefas</h1>
            <div>
                <table className="table">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>descrição</th>
                            <th>concluído</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            tarefas.map(
                                tarefa =>
                                <tr key={tarefa.id}>
                                    <td>{tarefa.id}</td>
                                    <td>{tarefa.descricao}</td>
                                    <td>{tarefa.concluido.toString()}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )
}