import axios from "axios";
import { useEffect, useState } from "react"
import { FaTrashAlt } from "react-icons/fa";

const clienteApi = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)

export const excluirTarefasApi = (username, idTarefa) =>
    clienteApi.delete(`/users/${username}/tarefas/${idTarefa}`);

export const obterTarefasApi = (username) =>
    clienteApi.get(`/users/${username}/tarefas`);

export default function ListaTarefas() {
    const [tarefas, setTarefas] = useState([]);

    useEffect(() => atualizarTarefas(), []);
    function atualizarTarefas() {
        obterTarefasApi('admin')
            .then(resposta => {
                console.log(resposta)
                setTarefas(resposta.data)
            })
            .catch(erro => console.log(erro));
    }

    function excluirTarefa(id) {
        excluirTarefasApi('admin', id)
            .then(resposta => {
                atualizarTarefas()
            })
            .catch(erro => console.log(erro))
    }

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
                                        <td><button className="btn btn-danger" onClick={
                                            () => excluirTarefa(tarefa.id)
                                        }><FaTrashAlt /></button></td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )
}