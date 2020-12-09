package com.oceano.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.oceano.cafe.model.Produto;
import com.oceano.cafe.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produto/index")
	public String indexProduto() {
		return "/produto/indexProduto";
	}
	
	@GetMapping("produto/estoque")
	public String estoqueProduto() {
		return "/produto/estoque";
	}
	
	@GetMapping("/produto/list")
	public String listProdutos(Model model) {
		model.addAttribute("allProdutos", produtoRepository.findAll());
		
		return "produto/list";
	}
	
	@GetMapping("/produto/add")
	public String addProduto(Model model) {
		model.addAttribute("produto", new Produto());
		return "produto/add";
	}
	
	@PostMapping("/produto/save")
	public String saveProduto(Produto produto) {
			try {
				if (produto != null) {
					produtoRepository.save(produto);
				}
			} catch (Exception e) {
				System.out.println("Erro ao salvar: " + e.getMessage());
				//return "produto/erro"; TODO finalizar esse controller
			}
			
			return "redirect:/produto/view/" + produto.getId();
	}
	
	@GetMapping("/produto/view/{id}")
	public String viewProduto(@PathVariable long id, Model model) {
		model.addAttribute("produto", produtoRepository.findById(id));
		return "produto/view";
	}
	
	@GetMapping("/produto/edit/{id}")
	public String editProduto(@PathVariable long id, Model model) {
		model.addAttribute("produto", produtoRepository.findById(id));
		return "produto/edit";
	}
	
	@GetMapping("/produto/delete/{id}")
	public String deleteProduto(@PathVariable long id, Model model) {
		model.addAttribute("produto", produtoRepository.findById(id));
		return "produto/delete";
	}
	
	@PostMapping("/produto/delete")
	public String deleteProduto(Produto produto) {
		try {
			if (produto != null) {
				produtoRepository.delete(produto);
			}
		} catch (Exception e) {
			System.out.println("Erro ao deletar: " + e.getMessage());
			//return "produto/erro"; TODO finalizar esse controller
		}
		
		return "redirect:/produto/list";
	}
}
