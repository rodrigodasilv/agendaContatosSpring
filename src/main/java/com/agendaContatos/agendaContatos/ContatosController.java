package com.agendaContatos.agendaContatos;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/contatos")
public class ContatosController {
    HashMap<Integer,Contato> agenda = new HashMap<Integer,Contato>();
    public Integer key=2;
    public ContatosController(){
        Contato contato1 = new Contato("Rodrigo",00000000,"email1@gmail.com");
        Contato contato2 = new Contato("Vandrian",11111111,"email2@gmail.com");
        this.agenda.put(1,contato1);
        this.agenda.put(2,contato2);
    }
    @GetMapping
    public ResponseEntity<HashMap<Integer,Contato>> contatos(){
        return ResponseEntity.ok(this.agenda);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> contato(@PathVariable Integer id){
        return ResponseEntity.ok(this.agenda.get(id));
    }

    @PostMapping
    public ResponseEntity<String> postContatos(@RequestBody Contato cont){
        this.agenda.put(this.key + 1,cont);
        return ResponseEntity.ok("Sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> putContatos(@PathVariable Integer id, @RequestBody Contato cont){
        this.agenda.put(id,cont);
        return ResponseEntity.ok("Sucesso!");
    }
}
