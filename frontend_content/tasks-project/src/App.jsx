import { useState } from 'react'
import './App.css'
import ComponenteDeClasse from './components/ComponenteDeClasse'
import CliqueLink from './components/CliqueLink'
import Alternar from './components/Alternar'
import Contador from './components/Contador'
import BemVindo from './components/BemVindo'
import Relogio from './components/Relogio'
import Login from './components/Login'
import TarefasApp from './components/TarefasApp'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
      {/* Tarefas App
      <BemVindo nome="Lucas"/>
      <PrimeiroComponente/>
      <SegundoComponente/>
      <ComponenteDeClasse/>
      <CliqueLink/>
      <br></br>
      <Alternar/>
      <Contador/>
      <Relogio/>
      <Login /> */}

        <TarefasApp/>

    </div>
  )
}

function PrimeiroComponente() {
  return (
    <div className='PrimeiroComponente'>PrimeiroComponente</div>
  )
}

function SegundoComponente() {
  return (
    <div className='SegundoComponente'>SegundoComponente</div>
  )
}

export default App
