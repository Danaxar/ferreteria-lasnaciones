package com.example.ferreterialasnaciones.Service;

import com.example.ferreterialasnaciones.Models.Tipoventa;
import com.example.ferreterialasnaciones.Repository.TipoventaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoventas")
public class TipoventaService {
    private final TipoventaRepository tipoVentaRepository;

    public TipoventaService(TipoventaRepository tipoVentaRepository) {
        this.tipoVentaRepository = tipoVentaRepository;
    }

    @PostMapping
    public void save(@RequestBody Tipoventa tipoVenta) {
        tipoVentaRepository.save(tipoVenta);
    }

    @GetMapping("/{id}")
    public Tipoventa getById(@PathVariable Integer id) {
        return tipoVentaRepository.getById(id);
    }

    @GetMapping
    public List<Tipoventa> getAll() {
        return tipoVentaRepository.getAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Tipoventa tipoVenta) {
        tipoVenta.setId_tipoVenta(id);
        tipoVentaRepository.update(tipoVenta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        tipoVentaRepository.delete(id);
    }
}
