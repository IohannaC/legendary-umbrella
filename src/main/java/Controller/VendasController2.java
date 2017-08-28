package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.ProdutoRepositorioV2;
import com.example.demo.VendaRepositorioV2;

@Controller
public class VendasController2 {

	private ProdutoRepositorioV2 pr;
	private VendaRepositorioV2 vr;
	
	@Autowired
	public VendasController2(ProdutoRepositorioV2 pr, VendaRepositorioV2 vr) {
		this.pr = pr;
		this.vr = vr;
	}
	                                           
	@GetMapping("/show-all-products")
	public String consultarProdutos(Model model) {
		model.addAttribute("name",pr.findAll());
		System.out.println(pr.findAll());
		return "show-all-products";
		//return pr.findAll();   
	}
}
