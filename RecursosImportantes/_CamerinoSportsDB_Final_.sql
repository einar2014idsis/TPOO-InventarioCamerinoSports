-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-11-2024 a las 23:03:42
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
(1, 'Camiseta'),
(3, 'Pelotas'),
(5, 'Guantes'),
(6, 'Zapatillas');

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
(2, 'Luis', 'Guevara', 0, '12345678901', 938191156),
(3, 'Kevin', 'Guevara', 87654321, NULL, 900156433);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallesventa`
--

CREATE TABLE `detallesventa` (
  `idDetalles` int(11) NOT NULL,
  `idVentas` int(11) NOT NULL,
  `idIngresos` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `importe` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallesventa`
--

INSERT INTO `detallesventa` (`idDetalles`, `idVentas`, `idIngresos`, `cantidad`, `importe`) VALUES
(41, 2, 2, 2, 111.00),
(42, 3, 2, 2, 111.00),
(43, 4, 2, 2, 111.00),
(44, 4, 2, 1, 55.50),
(45, 5, 2, 1, 55.50),
(46, 5, 2, 2, 111.00),
(47, 6, 2, 1, 55.50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos`
--

CREATE TABLE `ingresos` (
  `idIngresos` int(11) NOT NULL,
  `nombreProducto` varchar(50) NOT NULL,
  `stock` int(11) NOT NULL,
  `tallaNumero` varchar(10) NOT NULL,
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

INSERT INTO `ingresos` (`idIngresos`, `nombreProducto`, `stock`, `tallaNumero`, `idCategorias`, `fechaIngreso`, `idProveedor`, `precioCompra`, `precioVenta`, `importeCompra`, `importeVenta`) VALUES
(2, 'Guantes Adidas', 10, '7', 5, '2025-11-20', 1, 45.50, 55.50, 455.00, 555.00);

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
(1, 'adidas', '12345678901', 0, 'rfrw', 'q@gmail.com'),
(2, 'Nike', '75655545355', 0, 'La molina', '1@gmail.com');

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
  `tipoUsuario` varchar(25) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `contraseña` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `apellidoUsuario`, `generoUsuario`, `dniUsuario`, `direccionUsuario`, `telefonoUsuario`, `tipoUsuario`, `fechaInicio`, `fechaNacimiento`, `usuario`, `contraseña`) VALUES
(1, 'Luis Miguel', 'Guevara Flores', 'Masculino', 75267380, 'Jr. Miraflores 101', 938191156, 'Adminitrador', '2002-08-03', '2002-08-03', 'lguevara', 'e728dac9b1be642c0ad404ede97a0e8c8c204356b17839350bdef8d8706d177f');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idVentas` int(11) NOT NULL,
  `numVenta` varchar(10) NOT NULL,
  `idClientes` int(11) NOT NULL,
  `fechaVenta` date NOT NULL,
  `subtotal` decimal(10,2) NOT NULL,
  `igv` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idVentas`, `numVenta`, `idClientes`, `fechaVenta`, `subtotal`, `igv`, `total`) VALUES
(1, '00001', 3, '2024-11-20', 846.61, 152.39, 999.00),
(2, '00002', 3, '2024-10-20', 94.07, 16.93, 111.00),
(3, '00003', 2, '2024-11-20', 94.07, 16.93, 111.00),
(4, '00004', 1, '2024-11-22', 141.10, 25.40, 166.50),
(5, '00005', 1, '2024-11-20', 141.10, 25.40, 166.50),
(6, '00006', 1, '1010-10-10', 47.03, 8.47, 55.50),
(7, '00007', 1, '1010-10-10', 47.03, 8.47, 55.50),
(8, '00008', 1, '1010-10-10', 47.03, 8.47, 55.50),
(9, '00009', 1, '1010-10-10', 47.03, 8.47, 55.50),
(10, '00010', 1, '1010-10-10', 47.03, 8.47, 55.50),
(11, '00011', 1, '1010-10-10', 47.03, 8.47, 55.50),
(12, '00012', 1, '1010-10-10', 47.03, 8.47, 55.50),
(13, '00013', 1, '1010-10-10', 47.03, 8.47, 55.50),
(14, '00014', 1, '1010-10-10', 47.03, 8.47, 55.50),
(15, '00014', 1, '1010-10-10', 47.03, 8.47, 55.50),
(16, '00015', 1, '1010-10-10', 47.03, 8.47, 55.50),
(17, '00016', 2, '1010-10-10', 47.03, 8.47, 55.50),
(18, '00017', 2, '1010-10-10', 47.03, 8.47, 55.50),
(19, '00017', 2, '1010-10-10', 47.03, 8.47, 55.50),
(20, '00018', 3, '1010-10-10', 47.03, 8.47, 55.50);

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
-- Indices de la tabla `detallesventa`
--
ALTER TABLE `detallesventa`
  ADD PRIMARY KEY (`idDetalles`),
  ADD KEY `fk_ventas` (`idVentas`),
  ADD KEY `fk_ingresos` (`idIngresos`);

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
  ADD UNIQUE KEY `telefonoUsuario` (`telefonoUsuario`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVentas`),
  ADD KEY `fk_clientes` (`idClientes`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `idCategorias` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idClientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `detallesventa`
--
ALTER TABLE `detallesventa`
  MODIFY `idDetalles` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT de la tabla `ingresos`
--
ALTER TABLE `ingresos`
  MODIFY `idIngresos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVentas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallesventa`
--
ALTER TABLE `detallesventa`
  ADD CONSTRAINT `fk_ingresos` FOREIGN KEY (`idIngresos`) REFERENCES `ingresos` (`idIngresos`),
  ADD CONSTRAINT `fk_ventas` FOREIGN KEY (`idVentas`) REFERENCES `ventas` (`idVentas`);

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
  ADD CONSTRAINT `fk_clientes` FOREIGN KEY (`idClientes`) REFERENCES `clientes` (`idClientes`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
