import React, { useEffect, useState } from "react";

export default function App() {

  const API = "http://localhost:25000/api/camisas";

  const [form, setForm] = useState({

    nacao: "",
    ano: "",
    cor: "",
    tamanho: "",
    nomeJogador: "",
    numeroJogador: "",
    preco: ""

  });

  const [registros, setRegistros] = useState([]);

  function handleChange(e) {

    setForm({

      ...form,
      [e.target.name]: e.target.value

    });

  }

  async function carregarRegistros() {

    try {

      const response = await fetch(API);
      const data = await response.json();

      setRegistros(data);

    } catch (error) {

      console.error("Erro ao carregar:", error);

    }

  }

  async function criarRegistro() {

    try {

      await fetch(API, {

        method: "POST",

        headers: {

          "Content-Type": "application/json"

        },

        body: JSON.stringify({

          ...form,
          numeroJogador: Number(form.numeroJogador),
          preco: Number(form.preco)

        })

      });

      setForm({

        nacao: "",
        ano: "",
        cor: "",
        tamanho: "",
        nomeJogador: "",
        numeroJogador: "",
        preco: ""

      });

      carregarRegistros();

    } catch (error) {

      console.error("Erro ao criar:", error);

    }

  }

  async function removerRegistro(id) {

    try {

      await fetch(`${API}/${id}`, {

        method: "DELETE"

      });

      carregarRegistros();

    } catch (error) {

      console.error("Erro ao remover:", error);

    }

  }

  useEffect(() => {

    carregarRegistros();

  }, []);

  return (

    <div style={styles.container}>

      <h1 style={styles.title}>
        ⚽ Registro de Camisas
      </h1>

      <div style={styles.form}>

        <input name="nacao" placeholder="Nação" value={form.nacao} onChange={handleChange} style={styles.input} />

        <input name="ano" placeholder="Ano" value={form.ano} onChange={handleChange} style={styles.input} />

        <input name="cor" placeholder="Cor" value={form.cor} onChange={handleChange} style={styles.input} />

        <input name="tamanho" placeholder="Tamanho" value={form.tamanho} onChange={handleChange} style={styles.input} />

        <input name="nomeJogador" placeholder="Nome do Jogador" value={form.nomeJogador} onChange={handleChange} style={styles.input} />

        <input name="numeroJogador" placeholder="Número" type="number" value={form.numeroJogador} onChange={handleChange} style={styles.input} />

        <input name="preco" placeholder="Preço" type="number" value={form.preco} onChange={handleChange} style={styles.input} />

        <button onClick={criarRegistro} style={styles.button}>
          Adicionar Registro
        </button>

      </div>

      <h2>📋 Lista de Registros</h2>

      <table style={styles.table}>

        <thead>

          <tr>

            <th>Nação</th>
            <th>Ano</th>
            <th>Cor</th>
            <th>Tamanho</th>
            <th>Jogador</th>
            <th>Nº</th>
            <th>Preço</th>
            <th>Ação</th>

          </tr>

        </thead>

        <tbody>

          {registros.map((r) => (

            <tr key={r.id}>

              <td>{r.nacao}</td>
              <td>{r.ano}</td>
              <td>{r.cor}</td>
              <td>{r.tamanho}</td>
              <td>{r.nomeJogador}</td>
              <td>{r.numeroJogador}</td>
              <td>R$ {r.preco}</td>

              <td>

                <button
                  style={styles.deleteButton}
                  onClick={() => removerRegistro(r.id)}
                >
                  Excluir
                </button>

              </td>

            </tr>

          ))}

        </tbody>

      </table>

    </div>

  );

}

const styles = {

  container: {

    padding: "30px",
    fontFamily: "Arial"

  },

  title: {

    marginBottom: "20px"

  },

  form: {

    display: "grid",
    gridTemplateColumns: "repeat(4, 1fr)",
    gap: "10px",
    marginBottom: "20px"

  },

  input: {

    padding: "8px"

  },

  button: {

    gridColumn: "span 4",
    padding: "10px",
    background: "#007bff",
    color: "white",
    border: "none",
    cursor: "pointer"

  },

  deleteButton: {

    background: "#dc3545",
    color: "white",
    border: "none",
    padding: "5px 10px",
    cursor: "pointer"

  },

  table: {

    width: "100%",
    borderCollapse: "collapse"

  }

};