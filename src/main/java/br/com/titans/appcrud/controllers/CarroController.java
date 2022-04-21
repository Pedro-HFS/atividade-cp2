package br.com.titans.appcrud.controllers;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.titans.appcrud.dto.CarroDto;
import br.com.titans.appcrud.model.Carro;
import br.com.titans.appcrud.repositories.CarroRepository;

@Controller
public class CarroController {
	@Autowired
	private CarroRepository carroRepository;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/carro")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("carro/index");
		List<Carro> carrosDaRepository = carroRepository.findAll();
		modelView.addObject("listaCarros", carrosDaRepository);

		return modelView;
	}

	@GetMapping("/carro/criar")
	public ModelAndView criar(CarroDto model) {
		ModelAndView modelView = new ModelAndView("carro/criar");

		return modelView;
	}

	@PostMapping("/carro")
	public ModelAndView salvar(@Valid CarroDto carro, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return new ModelAndView("carro/criar");
		}

		Carro carroEntity = modelMapper.map(carro, Carro.class);

		carroRepository.save(carroEntity);
		return new ModelAndView("redirect:/carro");
	}
}
