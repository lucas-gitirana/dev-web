import { MD5 } from "crypto-js";
import { useState } from "react"
import { useNavigate } from "react-router-dom";
import { useAutCtx } from "./AutCtx";

const Login = () => {
    const [usuario, setUsuario] = useState('');
    const [senha, setSenha] = useState('');
    const [hash, setHash] = useState('');

    const navigate = useNavigate();

    const [loginSucesso, setLoginSucesso] = useState(false)
    const [loginFalhou, setLoginFalhou] = useState(false)

    function usuarioHandler(evento) {
        setUsuario(evento.target.value);
        console.log(usuario);
    }

    function senhaHandler(evento) {
        setHash(MD5(evento.target.value).toString())
        setSenha(evento.target.value)
        console.log(hash)
    }

    const autCtx = useAutCtx();
    function loginHandler() {
        const foiAutenticado = autCtx.autenticar(usuario, senha);
        if (foiAutenticado) {
            navigate(`/inicio/${usuario}`)
        }
    }

    return (
        <div className="Login">

            {loginSucesso && <div className="SucessoMsg">Autenticado com Sucesso!</div> }
            {loginFalhou && <div className="FalhouMsg">A autenticação falhou, confira seu login e senha</div>}

            <div className="LoginForm">
                <div>
                    <label>Usuário:</label>
                    <input type="text" name="usuario" value={usuario} onChange={usuarioHandler}/>
                </div>
                <div>
                    <label>Senha:</label>
                    <input type="password" name="senha" value={senha} onChange={senhaHandler}/>
                </div>
                <div>
                    <button type="button" name="login" onClick={loginHandler}>Login</button>
                </div>
            </div>
        </div>
    )
}

export default Login