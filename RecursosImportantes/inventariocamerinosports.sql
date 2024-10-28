-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2024 a las 18:11:10
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventariocamerinosports`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `idCategorias` int(11) NOT NULL,
  `categorias` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`idCategorias`, `categorias`) VALUES
(1, 'Zapatillas'),
(2, 'balones');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idClientes` int(11) NOT NULL,
  `nombreCliente` varchar(50) NOT NULL,
  `apellidoCliente` varchar(50) NOT NULL,
  `dniCliente` int(8) DEFAULT NULL,
  `rucCliente` varchar(11) DEFAULT NULL,
  `telefonoCliente` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idClientes`, `nombreCliente`, `apellidoCliente`, `dniCliente`, `rucCliente`, `telefonoCliente`) VALUES
(1, 'Diego', 'El Kiro', 12345678, NULL, 987654321),
(2, 'Julio', 'El ilusionado', 0, '12345678901', 123456789),
(3, 'Julio', 'El ilusionado', 0, '12345678900', 123456788),
(4, 'Luis', 'Guevara', 12345677, NULL, 987654321);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos`
--

CREATE TABLE `ingresos` (
  `idIngresos` int(11) NOT NULL,
  `nombreProducto` varchar(50) NOT NULL,
  `stock` int(11) NOT NULL,
  `idCategorias` int(11) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `precioCompra` decimal(10,2) NOT NULL,
  `precioVenta` decimal(10,2) NOT NULL,
  `importeCompra` decimal(10,2) NOT NULL,
  `importeVenta` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ingresos`
--

INSERT INTO `ingresos` (`idIngresos`, `nombreProducto`, `stock`, `idCategorias`, `fechaIngreso`, `idProveedor`, `precioCompra`, `precioVenta`, `importeCompra`, `importeVenta`) VALUES
(1, 'Balon Adidas', 25, 2, '2010-10-24', 1, 5.00, 10.00, 125.00, 250.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `nombreProveedor` varchar(50) NOT NULL,
  `rucProveedor` varchar(11) NOT NULL,
  `telefonoProveedor` int(9) NOT NULL,
  `direccionProveedor` varchar(50) NOT NULL,
  `correoProveedor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `nombreProveedor`, `rucProveedor`, `telefonoProveedor`, `direccionProveedor`, `correoProveedor`) VALUES
(1, 'adidas', '12345678901', 0, 'rfrw', 'q@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(50) NOT NULL,
  `apellidoUsuario` varchar(50) NOT NULL,
  `generoUsuario` varchar(20) NOT NULL,
  `dniUsuario` int(8) NOT NULL,
  `direccionUsuario` varchar(80) NOT NULL,
  `telefonoUsuario` int(9) NOT NULL,
  `correoUsuario` varchar(50) NOT NULL,
  `tipoUsuario` varchar(25) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `contraseña` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `apellidoUsuario`, `generoUsuario`, `dniUsuario`, `direccionUsuario`, `telefonoUsuario`, `correoUsuario`, `tipoUsuario`, `fechaInicio`, `fechaNacimiento`, `usuario`, `contraseña`) VALUES
(1, 'Luis Miguel', 'Guevara Flores', 'Masculino', 75267380, 'Jr. Miraflores 101', 938191156, 'lushitomi2002@gmail.com', 'Adminitrador', '2002-08-03', '2002-08-03', 'lguevara', 'e728dac9b1be642c0ad404ede97a0e8c8c204356b17839350bdef8d8706d177f'),
(2, 'Maria Fernanda', 'Lopez Diaz', 'Femenino', 74659301, 'Av. Siempre Viva 123', 915673281, 'marialopez@gmail.com', 'Usuario', '2021-05-12', '1999-04-22', 'mlopez', 'e728dac9b1be642c0ad404ede97a0e8c8c204356b17839350bdef8d8706d177f'),
(3, 'Jorge Luis', 'Perez Salazar', 'Masculino', 71239058, 'Calle Falsa 456', 989302765, 'jorge.perez@gmail.com', 'Usuario', '2023-01-10', '1997-12-15', 'jperez', 'e728dac9b1be642c0ad404ede97a0e8c8c204356b17839350bdef8d8706d177f');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idVentas` int(11) NOT NULL,
  `idIngresos` int(11) NOT NULL,
  `idClientes` int(11) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `fechaVenta` date NOT NULL,
  `subtotal` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`idCategorias`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idClientes`);

--
-- Indices de la tabla `ingresos`
--
ALTER TABLE `ingresos`
  ADD PRIMARY KEY (`idIngresos`),
  ADD KEY `fk_proveedor` (`idProveedor`),
  ADD KEY `fk_categorias` (`idCategorias`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`),
  ADD UNIQUE KEY `nombreProveedor` (`nombreProveedor`),
  ADD UNIQUE KEY `rucProveedor` (`rucProveedor`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`),
  ADD UNIQUE KEY `dniUsuario` (`dniUsuario`),
  ADD UNIQUE KEY `telefonoUsuario` (`telefonoUsuario`),
  ADD UNIQUE KEY `correoUsuario` (`correoUsuario`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVentas`),
  ADD KEY `fk_ingresos` (`idIngresos`),
  ADD KEY `fk_clientes` (`idClientes`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `idCategorias` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idClientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `ingresos`
--
ALTER TABLE `ingresos`
  MODIFY `idIngresos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVentas` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ingresos`
--
ALTER TABLE `ingresos`
  ADD CONSTRAINT `fk_categorias` FOREIGN KEY (`idCategorias`) REFERENCES `categorias` (`idCategorias`),
  ADD CONSTRAINT `fk_proveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `fk_clientes` FOREIGN KEY (`idClientes`) REFERENCES `clientes` (`idClientes`),
  ADD CONSTRAINT `fk_ingresos` FOREIGN KEY (`idIngresos`) REFERENCES `ingresos` (`idIngresos`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
