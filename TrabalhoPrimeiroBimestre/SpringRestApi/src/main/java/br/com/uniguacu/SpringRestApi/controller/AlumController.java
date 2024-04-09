package br.com.uniguacu.SpringRestApi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.uniguacu.SpringRestApi.model.Alum;
import br.com.uniguacu.SpringRestApi.service.AlumService;

@RestController
@RequestMapping("/api/v1/Trabalhoum")
public class AlumController {
    
    @Autowired
    private AlumService alumService;

    @PostMapping
    public ResponseEntity<Alum> create( @RequestBody Alum alum){
        return ResponseEntity.status(HttpStatus.CREATED).body(alumService.save(alum));
    }
    
}
