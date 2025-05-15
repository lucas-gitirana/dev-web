import { useState } from "react"

function Contador() {
    const [cont, setCont] = useState(0)

    function incContador() {
        setCont(cont + 1)
        console.log(cont)
    }

    function decContador() {
        setCont(cont - 1)
        console.log(cont)
    }

    return (
        <div className="Contador">
            <span className="contador">{cont}</span>
            <div>
                <button
                    className="contadorBtn"
                    onClick={incContador}
                >+1</button>
                <br />
                <button
                    className="contadorBtnDec"
                    onClick={decContador}
                >-1</button>
            </div>
        </div>
    )
}

export default Contador