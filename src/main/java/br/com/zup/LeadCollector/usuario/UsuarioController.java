package br.com.zup.LeadCollector.usuario;

import br.com.zup.LeadCollector.usuario.dtos.CadastroUsuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarUsuario(@RequestBody CadastroUsuarioDTO cadastroUsuarioDTO){
        Usuario usuario = modelMapper.map(cadastroUsuarioDTO, Usuario.class);

        usuarioService.salvarUsuario(usuario);
    }

}
