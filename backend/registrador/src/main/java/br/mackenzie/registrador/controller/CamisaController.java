package br.mackenzie.registrador.controller;

import br.mackenzie.registrador.entities.Camisa;
import br.mackenzie.registrador.repository.CamisaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/camisas")
public class CamisaController {

    private CamisaRepository camisaRepository;

    public CamisaController(CamisaRepository camisaRepository) {
        this.camisaRepository = camisaRepository;
    }

    @GetMapping
    public List<Camisa> getAllCamisas() {
        return camisaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Camisa getCamisaById(@PathVariable Long id) {
        Optional<Camisa> optional = camisaRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Camisa não encontrada!");
    }

    @PostMapping
    public Camisa createCamisa(@RequestBody Camisa camisa) {
        if (camisa.getNacao() == null || camisa.getNacao().isEmpty() ||
                camisa.getAno() == null || camisa.getAno().isEmpty() ||
                camisa.getCor() == null || camisa.getCor().isEmpty() ||
                camisa.getTamanho() == null || camisa.getTamanho().isEmpty() ||
                camisa.getNomeJogador() == null || camisa.getNomeJogador().isEmpty() ||
                camisa.getNumeroJogador() == null ||
                camisa.getPreco() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Todos os campos são obrigatórios!");
        }
        return camisaRepository.save(camisa);
    }

    @PutMapping("/{id}")
    public Camisa updateCamisaById(@PathVariable Long id, @RequestBody Camisa newData) {
        Optional<Camisa> optional = camisaRepository.findById(id);
        if (optional.isPresent()) {
            Camisa newCamisa = optional.get();
            newCamisa.setNacao(newData.getNacao());
            newCamisa.setAno(newData.getAno());
            newCamisa.setCor(newData.getCor());
            newCamisa.setTamanho(newData.getTamanho());
            newCamisa.setNomeJogador(newData.getNomeJogador());
            newCamisa.setNumeroJogador(newData.getNumeroJogador());
            newCamisa.setPreco(newData.getPreco());
            return camisaRepository.save(newCamisa);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Camisa não encontrada");
    }

    @DeleteMapping("/{id}")
    public Camisa deleteCamisaById(@PathVariable Long id) {
        Optional<Camisa> optional = camisaRepository.findById(id);
        if (optional.isPresent()) {
            Camisa del = optional.get();
            camisaRepository.deleteById(id);
            return del;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Camisa não encontrada");
    }

}
