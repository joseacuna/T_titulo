-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 18-12-2015 a las 03:39:41
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bd_arriendos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_administrador`
--

CREATE TABLE IF NOT EXISTS `tb_administrador` (
  `rut` varchar(10) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `telefono` int(10) NOT NULL,
  `celular` int(10) NOT NULL,
  `email` varchar(200) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `contrasena` varchar(50) NOT NULL,
  `tipo_usuario` int(1) NOT NULL,
  PRIMARY KEY (`rut`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tb_administrador`
--

INSERT INTO `tb_administrador` (`rut`, `nombre`, `telefono`, `celular`, `email`, `direccion`, `usuario`, `contrasena`, `tipo_usuario`) VALUES
('17273713-7', 'andres', 123, 123123, 'andres@gmail.com', 'asf', 'andres', '123456', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_articulo`
--

CREATE TABLE IF NOT EXISTS `tb_articulo` (
  `codigo` int(11) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `numero_serie` varchar(200) NOT NULL,
  `cod_categoria` int(3) NOT NULL,
  `cod_marca` int(3) NOT NULL,
  `modelo` varchar(200) NOT NULL,
  `observacion` varchar(500) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tb_articulo`
--

INSERT INTO `tb_articulo` (`codigo`, `descripcion`, `numero_serie`, `cod_categoria`, `cod_marca`, `modelo`, `observacion`) VALUES
(123, 'soni vaio vpcca', '131231221', 1, 1, 'vaio', 'modelo negro con unstalacion de office, windows 10'),
(111111, 'samsung smart tv', '3112313', 2, 1, 'smart tv lcd', 'asdasdas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_categoria`
--

CREATE TABLE IF NOT EXISTS `tb_categoria` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcar la base de datos para la tabla `tb_categoria`
--

INSERT INTO `tb_categoria` (`codigo`, `descripcion`) VALUES
(1, 'computadores'),
(2, 'televisores');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_cliente`
--

CREATE TABLE IF NOT EXISTS `tb_cliente` (
  `rut` varchar(10) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `telefono` int(10) NOT NULL,
  `celular` int(10) NOT NULL,
  `email` varchar(200) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `cod_departamento` int(3) NOT NULL,
  `nombreEncargado` varchar(200) NOT NULL,
  `telefonoEncargado` int(10) NOT NULL,
  `celularEncargado` int(10) NOT NULL,
  PRIMARY KEY (`rut`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tb_cliente`
--

INSERT INTO `tb_cliente` (`rut`, `nombre`, `telefono`, `celular`, `email`, `direccion`, `cod_departamento`, `nombreEncargado`, `telefonoEncargado`, `celularEncargado`) VALUES
('17273713-7', 'andres noguera', 21312, 1232123123, 'andres@gmail.com', 'viña del mar', 2, 'andres noguera', 21312, 1232123123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_departamento`
--

CREATE TABLE IF NOT EXISTS `tb_departamento` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcar la base de datos para la tabla `tb_departamento`
--

INSERT INTO `tb_departamento` (`codigo`, `descripcion`) VALUES
(1, 'oficina'),
(2, 'juridica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_instalador`
--

CREATE TABLE IF NOT EXISTS `tb_instalador` (
  `rut` varchar(10) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `telefono` int(10) NOT NULL,
  `celular` int(10) NOT NULL,
  `email` varchar(200) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `contrasena` varchar(200) NOT NULL,
  PRIMARY KEY (`rut`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tb_instalador`
--

INSERT INTO `tb_instalador` (`rut`, `nombre`, `telefono`, `celular`, `email`, `direccion`, `usuario`, `contrasena`) VALUES
('172737137', 'andres noguera', 939393, 53538049, 'andres17_ltd@hotmail.com', 'viña del mar', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_marca`
--

CREATE TABLE IF NOT EXISTS `tb_marca` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcar la base de datos para la tabla `tb_marca`
--

INSERT INTO `tb_marca` (`codigo`, `descripcion`) VALUES
(1, 'vaio'),
(2, 'samsung');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_reserva`
--

CREATE TABLE IF NOT EXISTS `tb_reserva` (
  `folio` int(11) NOT NULL AUTO_INCREMENT,
  `num` int(11) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `fecha_entrega` varchar(10) NOT NULL,
  `hora` varchar(10) NOT NULL,
  `hora_entrega` varchar(10) NOT NULL,
  `rut` varchar(10) NOT NULL,
  `observacion` varchar(200) NOT NULL,
  `cod_admin` varchar(10) NOT NULL,
  `cod_instalador` varchar(10) NOT NULL,
  `estado` int(1) NOT NULL,
  PRIMARY KEY (`folio`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `tb_reserva`
--

INSERT INTO `tb_reserva` (`folio`, `num`, `fecha`, `fecha_entrega`, `hora`, `hora_entrega`, `rut`, `observacion`, `cod_admin`, `cod_instalador`, `estado`) VALUES
(1, 1, '8/12/15', '8/12/15', '08:00', '08:00', '17273713-7', 'weqweqweqweqe', '', '', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_reserva_detalle`
--

CREATE TABLE IF NOT EXISTS `tb_reserva_detalle` (
  `folio` int(11) NOT NULL,
  `num` int(3) NOT NULL,
  `codigo` varchar(20) NOT NULL,
  `descripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tb_reserva_detalle`
--

INSERT INTO `tb_reserva_detalle` (`folio`, `num`, `codigo`, `descripcion`) VALUES
(1, 0, '123', 'soni vaio vpcca');
