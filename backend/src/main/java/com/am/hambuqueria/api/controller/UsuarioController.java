package com.am.hambuqueria.api.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.am.hambuqueria.api.dto.mapper.UsuarioMapperDTO;
import com.am.hambuqueria.api.dto.response.UsuarioResponseDTO;
import com.am.hambuqueria.domain.model.Usuario;
import com.am.hambuqueria.domain.service.UsuarioService;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@RestController
@AllArgsConstructor
@RequestMapping(value = "/usuario")
public class UsuarioController {

}
