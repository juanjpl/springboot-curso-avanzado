package ar.com.springboot.j.springbootI.controllers;

import org.springframework.web.bind.annotation.*;
import com.example.demostration.DemostrationApplication;
import com.example.demostration.model.User;

@RestController
@RequestMapping("/saludar")
public class Controller {

    private final DemostrationApplication demostrationApplication;

    Controller(DemostrationApplication demostrationApplication) {
        this.demostrationApplication = demostrationApplication;
    }

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello world!";
	}

	@GetMapping("/{name}")
	public String saludarName(@PathVariable String name) {

		return "Hello " + name + "!!";
	}

	@GetMapping("/crear/{nombre}")
	public User creacionUser(@PathVariable String nombre) {
		User a = obtenerUsuario();
		a.setNombre(nombre);
		return a;
	}

	@GetMapping("/crear/{nombre}/{apellido}")
	public User crearUserCompleto(@PathVariable String nombre, @PathVariable String apellido) {

		return new User(nombre, apellido);

	}

	@GetMapping("/sayGoodBye")
	public String saludar2(@RequestParam String nombre) {

		return "Good bye " + nombre;

	}

	private User obtenerUsuario() {
		return new User();
	}

	public DemostrationApplication getDemostrationApplication() {
		return demostrationApplication;
	}
}
