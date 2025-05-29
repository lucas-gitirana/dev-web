import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom"
import Login from "./Login"
import BemVindo from "./BemVindo"
import Erro from "./Erro"
import ListaTarefas from "./ListaTarefas"
import Rodape from "./Rodape"
import "./TarefasApp.css"
import Cabecalho from "./Cabecalho"
import Logout from "./Logout"
import AutProvider, { useAutCtx } from "./AutCtx"

function AuthenticatedRoute({children}) {
    const autCtx = useAutCtx();

    if (autCtx.autenticado) {
        return children;
    }

    return <Navigate to="/"/>
}

const TarefasApp = () => {

    return (
        <div className="TarefasApp">
            <AutProvider>
                <BrowserRouter>
                    <Cabecalho />
                    <Routes>
                        <Route path="/" element={<Login />}></Route>
                        <Route path="/login" element={<Login />}></Route>
                        <Route path="/inicio/:usuario" element={
                            <AuthenticatedRoute>
                                <BemVindo nome="Lucas" />
                            </AuthenticatedRoute>
                        } />
                        <Route path="/tarefas" element={<ListaTarefas />}></Route>
                        <Route path="/logout" element={<Logout />}></Route>
                        <Route path="*" element={<Erro />}></Route>
                    </Routes>
                    <Rodape />
                </BrowserRouter>
            </AutProvider>
        </div>
    )

}

export default TarefasApp