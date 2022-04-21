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

import br.com.titans.appcrud.dto.MotoDto;
import br.com.titans.appcrud.model.Moto;
import br.com.titans.appcrud.repositories.MotoRepository;

@Controller
public class MotoController {
	@Autowired
	private MotoRepository motoRepository;

	@Autowired
	private ModelMapper modelMapper;

	@GetMapping("/moto")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("moto/index");

		List<Moto> motosDaRepository = motoRepository.findAll();
		modelView.addObject("listaMotos", motosDaRepository);

		return modelView;
	}

	@GetMapping("/moto/criar")
	public ModelAndView criar(MotoDto model) {
		ModelAndView modelView = new ModelAndView("moto/criar");

		return modelView;
	}

	@PostMapping("/moto")
	public ModelAndView salvar(@Valid MotoDto moto, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return new ModelAndView("moto/criar");
		}

		Moto motoEntity = modelMapper.map(moto, Moto.class);

		motoRepository.save(motoEntity);
		return new ModelAndView("redirect:/moto");
	}
}
