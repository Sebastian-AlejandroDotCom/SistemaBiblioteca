-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 10, 2018 at 12:02 AM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `SistemaBiblioteca`
--

-- --------------------------------------------------------

--
-- Table structure for table `Arriendo`
--

CREATE TABLE `Arriendo` (
  `idArriendo` int(11) NOT NULL,
  `costoTotal` int(11) NOT NULL,
  `fechaArriendo` date NOT NULL,
  `fechaDevolucion` date NOT NULL,
  `fechaEntrega` date NOT NULL,
  `diasRetraso` int(11) NOT NULL,
  `multa` int(11) NOT NULL,
  `costoArriendo` int(11) NOT NULL,
  `clienteInvolucrado` int(11) DEFAULT NULL,
  `trabajadorInvolucrado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Arriendo_Libro`
--

CREATE TABLE `Arriendo_Libro` (
  `idArriendoLibro` int(11) NOT NULL,
  `arriendo` int(11) NOT NULL,
  `libro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Autor`
--

CREATE TABLE `Autor` (
  `idAutor` int(11) NOT NULL,
  `nombre` varchar(35) NOT NULL,
  `apellidoPaterno` varchar(35) NOT NULL,
  `apellidoMaterno` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Autor`
--

INSERT INTO `Autor` (`idAutor`, `nombre`, `apellidoPaterno`, `apellidoMaterno`) VALUES
(1, 'LORENSO', 'SILVA', 'AMADOR'),
(2, 'STEPHEN', 'KING', 'EDWIN'),
(3, 'LEONARDO', 'PADURA', 'FUENTES'),
(4, 'STEPHEN', 'HAWKING', 'WILLIAM');

-- --------------------------------------------------------

--
-- Table structure for table `Boleta`
--

CREATE TABLE `Boleta` (
  `idBoleta` int(11) NOT NULL,
  `folio` int(11) NOT NULL,
  `precioNeto` int(11) NOT NULL,
  `precioConIva` int(11) NOT NULL,
  `costoIva` int(11) NOT NULL,
  `fechaHoraVenta` datetime NOT NULL,
  `clienteInvolucrado` int(11) DEFAULT NULL,
  `trabajadorInvolucrado` int(11) DEFAULT NULL,
  `metodoPago` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Categoria`
--

CREATE TABLE `Categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombreCategoria` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Categoria`
--

INSERT INTO `Categoria` (`idCategoria`, `nombreCategoria`) VALUES
(1, 'Terror'),
(2, 'Ciencia ficción');

-- --------------------------------------------------------

--
-- Table structure for table `Cliente`
--

CREATE TABLE `Cliente` (
  `rut` int(11) NOT NULL,
  `nombreCliente` varchar(35) NOT NULL,
  `apellidoPaterno` varchar(35) NOT NULL,
  `apellidoMaterno` varchar(35) NOT NULL,
  `fechaNacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Cliente_Correo`
--

CREATE TABLE `Cliente_Correo` (
  `idClienteCorreo` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `correo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Cliente_Direccion`
--

CREATE TABLE `Cliente_Direccion` (
  `idClienteDireccion` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `direccion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Cliente_Telefono`
--

CREATE TABLE `Cliente_Telefono` (
  `idClienteTelefono` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Compra`
--

CREATE TABLE `Compra` (
  `idCompra` int(11) NOT NULL,
  `distribuidorInvolucrado` int(11) DEFAULT NULL,
  `factura` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Compra_Libro`
--

CREATE TABLE `Compra_Libro` (
  `idCompraLibro` int(11) NOT NULL,
  `compra` int(11) NOT NULL,
  `libro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Correo`
--

CREATE TABLE `Correo` (
  `idCorreo` int(11) NOT NULL,
  `detalleCorreo` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Correo`
--

INSERT INTO `Correo` (`idCorreo`, `detalleCorreo`) VALUES
(145, 'example@mail.com'),
(146, 'example2@mail.com');

-- --------------------------------------------------------

--
-- Table structure for table `Direccion`
--

CREATE TABLE `Direccion` (
  `idDireccion` int(11) NOT NULL,
  `detalleDireccion` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Distribuidor`
--

CREATE TABLE `Distribuidor` (
  `rut` int(11) NOT NULL,
  `nombreEmpresa` varchar(35) NOT NULL,
  `direccion` int(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `añoInicioVentas` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Editorial`
--

CREATE TABLE `Editorial` (
  `idEditorial` int(11) NOT NULL,
  `nombreEditorial` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Editorial`
--

INSERT INTO `Editorial` (`idEditorial`, `nombreEditorial`) VALUES
(1, 'DEBATE'),
(2, 'DESTINO'),
(3, 'TUSQUETS EDITORES'),
(6, 'DEBOLSILLO');

-- --------------------------------------------------------

--
-- Table structure for table `Estado_Libro`
--

CREATE TABLE `Estado_Libro` (
  `idEstado` int(11) NOT NULL,
  `libro` int(11) NOT NULL,
  `estado` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Factura`
--

CREATE TABLE `Factura` (
  `idFactura` int(11) NOT NULL,
  `folio` varchar(35) NOT NULL,
  `precioNeto` int(11) NOT NULL,
  `precioConIva` int(11) NOT NULL,
  `costoIva` int(11) NOT NULL,
  `fechaHoraCompra` datetime NOT NULL,
  `distribuidorInvolucrado` int(11) DEFAULT NULL,
  `metodoPago` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Idioma`
--

CREATE TABLE `Idioma` (
  `idIdioma` int(11) NOT NULL,
  `nombreIdioma` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Libro`
--

CREATE TABLE `Libro` (
  `numeroSerie` int(11) NOT NULL,
  `ISBN` varchar(35) NOT NULL,
  `titulo` varchar(35) NOT NULL,
  `paginas` int(11) NOT NULL,
  `precio` int(11) NOT NULL,
  `año` date NOT NULL,
  `publicacion` date NOT NULL,
  `editorial` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Libro`
--

INSERT INTO `Libro` (`numeroSerie`, `ISBN`, `titulo`, `paginas`, `precio`, `año`, `publicacion`, `editorial`) VALUES
(1, '9569545739', 'LA TEORIA DEL TODO', 160, 11400, '2007-03-05', '2007-05-07', 1),
(2, '9789563840636', 'LEJOS DEL CORAZÓN', 384, 15000, '2017-12-03', '2018-03-05', 2),
(3, '9788490664797', 'LA TRANSPARENCIA DEL TIEMPO', 448, 6000, '2018-02-26', '2018-04-05', 3),
(4, '9788497593793', 'IT', 1504, 7000, '1999-03-11', '2016-06-03', 6),
(5, '8401020417', 'BELLAS DURMIENTES', 768, 13200, '2017-12-05', '2018-01-09', 6),
(7, '666', 'XD', 10, 5000, '2018-04-03', '2018-06-11', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `Libro_Autor`
--

CREATE TABLE `Libro_Autor` (
  `idLibroAutor` int(11) NOT NULL,
  `libro` int(11) NOT NULL,
  `autor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Libro_Autor`
--

INSERT INTO `Libro_Autor` (`idLibroAutor`, `libro`, `autor`) VALUES
(1, 1, 4),
(2, 4, 2),
(3, 2, 1),
(4, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `Libro_Categoria`
--

CREATE TABLE `Libro_Categoria` (
  `idLibroCategoria` int(11) NOT NULL,
  `libro` int(11) NOT NULL,
  `categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Libro_Idioma`
--

CREATE TABLE `Libro_Idioma` (
  `idLibroIdioma` int(11) NOT NULL,
  `libro` int(11) NOT NULL,
  `idioma` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Metodo_Pago`
--

CREATE TABLE `Metodo_Pago` (
  `idMetodoPago` int(11) NOT NULL,
  `detalleMetodoPago` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Telefono`
--

CREATE TABLE `Telefono` (
  `idTelefono` int(11) NOT NULL,
  `detalleTelefono` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Trabajador`
--

CREATE TABLE `Trabajador` (
  `rut` int(11) NOT NULL,
  `nombreTrabajador` varchar(35) NOT NULL,
  `apellidoPaterno` varchar(35) NOT NULL,
  `apellidoMaterno` varchar(35) NOT NULL,
  `fechaContratacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Trabajador_Correo`
--

CREATE TABLE `Trabajador_Correo` (
  `idTrabajadorCorreo` int(11) NOT NULL,
  `trabajador` int(11) NOT NULL,
  `correo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Trabajador_Direccion`
--

CREATE TABLE `Trabajador_Direccion` (
  `idTrabajadorDireccion` int(11) NOT NULL,
  `trabajador` int(11) NOT NULL,
  `direccion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Trabajador_Telefono`
--

CREATE TABLE `Trabajador_Telefono` (
  `idTrabajadorTelefono` int(11) NOT NULL,
  `trabajador` int(11) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Venta`
--

CREATE TABLE `Venta` (
  `idVenta` int(11) NOT NULL,
  `clienteInvolucrado` int(11) DEFAULT NULL,
  `trabajadorInvolucrado` int(11) DEFAULT NULL,
  `boleta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Venta_Libro`
--

CREATE TABLE `Venta_Libro` (
  `idVentaLibro` int(11) NOT NULL,
  `venta` int(11) NOT NULL,
  `libro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Arriendo`
--
ALTER TABLE `Arriendo`
  ADD PRIMARY KEY (`idArriendo`),
  ADD KEY `r_arriendo_cliente` (`clienteInvolucrado`),
  ADD KEY `r_arriendo_trabajador` (`trabajadorInvolucrado`);

--
-- Indexes for table `Arriendo_Libro`
--
ALTER TABLE `Arriendo_Libro`
  ADD PRIMARY KEY (`idArriendoLibro`),
  ADD KEY `r_arriendo_libro` (`arriendo`),
  ADD KEY `r_libro_arriendo` (`libro`);

--
-- Indexes for table `Autor`
--
ALTER TABLE `Autor`
  ADD PRIMARY KEY (`idAutor`);

--
-- Indexes for table `Boleta`
--
ALTER TABLE `Boleta`
  ADD PRIMARY KEY (`idBoleta`),
  ADD KEY `r_boleta_cliente` (`clienteInvolucrado`),
  ADD KEY `r_boleta_trabajador` (`trabajadorInvolucrado`),
  ADD KEY `r_boleta_metodoPago` (`metodoPago`);

--
-- Indexes for table `Categoria`
--
ALTER TABLE `Categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indexes for table `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`rut`);

--
-- Indexes for table `Cliente_Correo`
--
ALTER TABLE `Cliente_Correo`
  ADD PRIMARY KEY (`idClienteCorreo`),
  ADD KEY `r_cliente_correo` (`cliente`),
  ADD KEY `r_correo_cliente` (`correo`);

--
-- Indexes for table `Cliente_Direccion`
--
ALTER TABLE `Cliente_Direccion`
  ADD PRIMARY KEY (`idClienteDireccion`),
  ADD KEY `r_cliente_direccion` (`cliente`),
  ADD KEY `r_direccion_cliente` (`direccion`);

--
-- Indexes for table `Cliente_Telefono`
--
ALTER TABLE `Cliente_Telefono`
  ADD PRIMARY KEY (`idClienteTelefono`),
  ADD KEY `r_cliente_telefono` (`cliente`),
  ADD KEY `r_telefono_cliente` (`telefono`);

--
-- Indexes for table `Compra`
--
ALTER TABLE `Compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `r_compra_distribuidor` (`distribuidorInvolucrado`),
  ADD KEY `r_compra_factura` (`factura`);

--
-- Indexes for table `Compra_Libro`
--
ALTER TABLE `Compra_Libro`
  ADD PRIMARY KEY (`idCompraLibro`),
  ADD KEY `r_compra_libro` (`compra`),
  ADD KEY `r_libro_compra` (`libro`);

--
-- Indexes for table `Correo`
--
ALTER TABLE `Correo`
  ADD PRIMARY KEY (`idCorreo`);

--
-- Indexes for table `Direccion`
--
ALTER TABLE `Direccion`
  ADD PRIMARY KEY (`idDireccion`);

--
-- Indexes for table `Distribuidor`
--
ALTER TABLE `Distribuidor`
  ADD PRIMARY KEY (`rut`),
  ADD KEY `r_distribuidor_direccion` (`direccion`),
  ADD KEY `r_distribuidor_telefono` (`telefono`);

--
-- Indexes for table `Editorial`
--
ALTER TABLE `Editorial`
  ADD PRIMARY KEY (`idEditorial`);

--
-- Indexes for table `Estado_Libro`
--
ALTER TABLE `Estado_Libro`
  ADD PRIMARY KEY (`idEstado`),
  ADD KEY `r_estado_libro` (`libro`);

--
-- Indexes for table `Factura`
--
ALTER TABLE `Factura`
  ADD PRIMARY KEY (`idFactura`),
  ADD KEY `r_factura_distribuidor` (`distribuidorInvolucrado`),
  ADD KEY `r_factura_metodoPago` (`metodoPago`);

--
-- Indexes for table `Idioma`
--
ALTER TABLE `Idioma`
  ADD PRIMARY KEY (`idIdioma`);

--
-- Indexes for table `Libro`
--
ALTER TABLE `Libro`
  ADD PRIMARY KEY (`numeroSerie`),
  ADD KEY `r_libro_editorial` (`editorial`);

--
-- Indexes for table `Libro_Autor`
--
ALTER TABLE `Libro_Autor`
  ADD PRIMARY KEY (`idLibroAutor`),
  ADD KEY `r_libro_autor` (`libro`),
  ADD KEY `r_autor_libro` (`autor`);

--
-- Indexes for table `Libro_Categoria`
--
ALTER TABLE `Libro_Categoria`
  ADD PRIMARY KEY (`idLibroCategoria`),
  ADD KEY `r_libro_categoria` (`libro`),
  ADD KEY `r_categoria_libro` (`categoria`);

--
-- Indexes for table `Libro_Idioma`
--
ALTER TABLE `Libro_Idioma`
  ADD PRIMARY KEY (`idLibroIdioma`),
  ADD KEY `r_libro_idioma` (`libro`),
  ADD KEY `r_idioma_libro` (`idioma`);

--
-- Indexes for table `Metodo_Pago`
--
ALTER TABLE `Metodo_Pago`
  ADD PRIMARY KEY (`idMetodoPago`);

--
-- Indexes for table `Telefono`
--
ALTER TABLE `Telefono`
  ADD PRIMARY KEY (`idTelefono`);

--
-- Indexes for table `Trabajador`
--
ALTER TABLE `Trabajador`
  ADD PRIMARY KEY (`rut`);

--
-- Indexes for table `Trabajador_Correo`
--
ALTER TABLE `Trabajador_Correo`
  ADD PRIMARY KEY (`idTrabajadorCorreo`),
  ADD KEY `r_trabajador_correo` (`trabajador`),
  ADD KEY `r_correo_trabajador` (`correo`);

--
-- Indexes for table `Trabajador_Direccion`
--
ALTER TABLE `Trabajador_Direccion`
  ADD PRIMARY KEY (`idTrabajadorDireccion`),
  ADD KEY `r_trabajador_direccion` (`trabajador`),
  ADD KEY `r_direccion_trabajador` (`direccion`);

--
-- Indexes for table `Trabajador_Telefono`
--
ALTER TABLE `Trabajador_Telefono`
  ADD PRIMARY KEY (`idTrabajadorTelefono`),
  ADD KEY `r_trabajador_telefono` (`trabajador`),
  ADD KEY `r_telefono_trabajador` (`telefono`);

--
-- Indexes for table `Venta`
--
ALTER TABLE `Venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `r_venta_cliente` (`clienteInvolucrado`),
  ADD KEY `r_venta_trabajador` (`trabajadorInvolucrado`),
  ADD KEY `r_venta_boleta` (`boleta`);

--
-- Indexes for table `Venta_Libro`
--
ALTER TABLE `Venta_Libro`
  ADD PRIMARY KEY (`idVentaLibro`),
  ADD KEY `r_venta_libro` (`venta`),
  ADD KEY `r_libro_venta` (`libro`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Arriendo`
--
ALTER TABLE `Arriendo`
  MODIFY `idArriendo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Arriendo_Libro`
--
ALTER TABLE `Arriendo_Libro`
  MODIFY `idArriendoLibro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Autor`
--
ALTER TABLE `Autor`
  MODIFY `idAutor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `Boleta`
--
ALTER TABLE `Boleta`
  MODIFY `idBoleta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Categoria`
--
ALTER TABLE `Categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Cliente`
--
ALTER TABLE `Cliente`
  MODIFY `rut` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Cliente_Correo`
--
ALTER TABLE `Cliente_Correo`
  MODIFY `idClienteCorreo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Cliente_Direccion`
--
ALTER TABLE `Cliente_Direccion`
  MODIFY `idClienteDireccion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Cliente_Telefono`
--
ALTER TABLE `Cliente_Telefono`
  MODIFY `idClienteTelefono` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Compra`
--
ALTER TABLE `Compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Compra_Libro`
--
ALTER TABLE `Compra_Libro`
  MODIFY `idCompraLibro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Correo`
--
ALTER TABLE `Correo`
  MODIFY `idCorreo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=147;

--
-- AUTO_INCREMENT for table `Direccion`
--
ALTER TABLE `Direccion`
  MODIFY `idDireccion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Distribuidor`
--
ALTER TABLE `Distribuidor`
  MODIFY `rut` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Editorial`
--
ALTER TABLE `Editorial`
  MODIFY `idEditorial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `Estado_Libro`
--
ALTER TABLE `Estado_Libro`
  MODIFY `idEstado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Factura`
--
ALTER TABLE `Factura`
  MODIFY `idFactura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Idioma`
--
ALTER TABLE `Idioma`
  MODIFY `idIdioma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Libro`
--
ALTER TABLE `Libro`
  MODIFY `numeroSerie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `Libro_Autor`
--
ALTER TABLE `Libro_Autor`
  MODIFY `idLibroAutor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `Libro_Categoria`
--
ALTER TABLE `Libro_Categoria`
  MODIFY `idLibroCategoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Libro_Idioma`
--
ALTER TABLE `Libro_Idioma`
  MODIFY `idLibroIdioma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Metodo_Pago`
--
ALTER TABLE `Metodo_Pago`
  MODIFY `idMetodoPago` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Telefono`
--
ALTER TABLE `Telefono`
  MODIFY `idTelefono` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Trabajador`
--
ALTER TABLE `Trabajador`
  MODIFY `rut` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Trabajador_Correo`
--
ALTER TABLE `Trabajador_Correo`
  MODIFY `idTrabajadorCorreo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Trabajador_Direccion`
--
ALTER TABLE `Trabajador_Direccion`
  MODIFY `idTrabajadorDireccion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Trabajador_Telefono`
--
ALTER TABLE `Trabajador_Telefono`
  MODIFY `idTrabajadorTelefono` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Venta`
--
ALTER TABLE `Venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Venta_Libro`
--
ALTER TABLE `Venta_Libro`
  MODIFY `idVentaLibro` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Arriendo`
--
ALTER TABLE `Arriendo`
  ADD CONSTRAINT `r_arriendo_cliente` FOREIGN KEY (`clienteInvolucrado`) REFERENCES `Cliente` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `r_arriendo_trabajador` FOREIGN KEY (`trabajadorInvolucrado`) REFERENCES `Trabajador` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `Arriendo_Libro`
--
ALTER TABLE `Arriendo_Libro`
  ADD CONSTRAINT `r_arriendo_libro` FOREIGN KEY (`arriendo`) REFERENCES `Arriendo` (`idArriendo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_libro_arriendo` FOREIGN KEY (`libro`) REFERENCES `Libro` (`numeroSerie`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Boleta`
--
ALTER TABLE `Boleta`
  ADD CONSTRAINT `r_boleta_cliente` FOREIGN KEY (`clienteInvolucrado`) REFERENCES `Cliente` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `r_boleta_metodoPago` FOREIGN KEY (`metodoPago`) REFERENCES `Metodo_Pago` (`idMetodoPago`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `r_boleta_trabajador` FOREIGN KEY (`trabajadorInvolucrado`) REFERENCES `Trabajador` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `Cliente_Correo`
--
ALTER TABLE `Cliente_Correo`
  ADD CONSTRAINT `r_cliente_correo` FOREIGN KEY (`cliente`) REFERENCES `Cliente` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_correo_cliente` FOREIGN KEY (`correo`) REFERENCES `Correo` (`idCorreo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Cliente_Direccion`
--
ALTER TABLE `Cliente_Direccion`
  ADD CONSTRAINT `r_cliente_direccion` FOREIGN KEY (`cliente`) REFERENCES `Cliente` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_direccion_cliente` FOREIGN KEY (`direccion`) REFERENCES `Direccion` (`idDireccion`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Cliente_Telefono`
--
ALTER TABLE `Cliente_Telefono`
  ADD CONSTRAINT `r_cliente_telefono` FOREIGN KEY (`cliente`) REFERENCES `Cliente` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_telefono_cliente` FOREIGN KEY (`telefono`) REFERENCES `Telefono` (`idTelefono`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Compra`
--
ALTER TABLE `Compra`
  ADD CONSTRAINT `r_compra_distribuidor` FOREIGN KEY (`distribuidorInvolucrado`) REFERENCES `Distribuidor` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `r_compra_factura` FOREIGN KEY (`factura`) REFERENCES `Factura` (`idFactura`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Compra_Libro`
--
ALTER TABLE `Compra_Libro`
  ADD CONSTRAINT `r_compra_libro` FOREIGN KEY (`compra`) REFERENCES `Compra` (`idCompra`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_libro_compra` FOREIGN KEY (`libro`) REFERENCES `Libro` (`numeroSerie`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Distribuidor`
--
ALTER TABLE `Distribuidor`
  ADD CONSTRAINT `r_distribuidor_direccion` FOREIGN KEY (`direccion`) REFERENCES `Direccion` (`idDireccion`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `r_distribuidor_telefono` FOREIGN KEY (`telefono`) REFERENCES `Telefono` (`idTelefono`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `Estado_Libro`
--
ALTER TABLE `Estado_Libro`
  ADD CONSTRAINT `r_estado_libro` FOREIGN KEY (`libro`) REFERENCES `Libro` (`numeroSerie`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Factura`
--
ALTER TABLE `Factura`
  ADD CONSTRAINT `r_factura_distribuidor` FOREIGN KEY (`distribuidorInvolucrado`) REFERENCES `Distribuidor` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `r_factura_metodoPago` FOREIGN KEY (`metodoPago`) REFERENCES `Metodo_Pago` (`idMetodoPago`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `Libro`
--
ALTER TABLE `Libro`
  ADD CONSTRAINT `r_libro_editorial` FOREIGN KEY (`editorial`) REFERENCES `Editorial` (`idEditorial`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `Libro_Autor`
--
ALTER TABLE `Libro_Autor`
  ADD CONSTRAINT `r_autor_libro` FOREIGN KEY (`autor`) REFERENCES `Autor` (`idAutor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_libro_autor` FOREIGN KEY (`libro`) REFERENCES `Libro` (`numeroSerie`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Libro_Categoria`
--
ALTER TABLE `Libro_Categoria`
  ADD CONSTRAINT `r_categoria_libro` FOREIGN KEY (`categoria`) REFERENCES `Categoria` (`idCategoria`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_libro_categoria` FOREIGN KEY (`libro`) REFERENCES `Libro` (`numeroSerie`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Libro_Idioma`
--
ALTER TABLE `Libro_Idioma`
  ADD CONSTRAINT `r_idioma_libro` FOREIGN KEY (`idioma`) REFERENCES `Idioma` (`idIdioma`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_libro_idioma` FOREIGN KEY (`libro`) REFERENCES `Libro` (`numeroSerie`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Trabajador_Correo`
--
ALTER TABLE `Trabajador_Correo`
  ADD CONSTRAINT `r_correo_trabajador` FOREIGN KEY (`correo`) REFERENCES `Correo` (`idCorreo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_trabajador_correo` FOREIGN KEY (`trabajador`) REFERENCES `Trabajador` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Trabajador_Direccion`
--
ALTER TABLE `Trabajador_Direccion`
  ADD CONSTRAINT `r_direccion_trabajador` FOREIGN KEY (`direccion`) REFERENCES `Direccion` (`idDireccion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_trabajador_direccion` FOREIGN KEY (`trabajador`) REFERENCES `Trabajador` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Trabajador_Telefono`
--
ALTER TABLE `Trabajador_Telefono`
  ADD CONSTRAINT `r_telefono_trabajador` FOREIGN KEY (`telefono`) REFERENCES `Telefono` (`idTelefono`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_trabajador_telefono` FOREIGN KEY (`trabajador`) REFERENCES `Trabajador` (`rut`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Venta`
--
ALTER TABLE `Venta`
  ADD CONSTRAINT `r_venta_boleta` FOREIGN KEY (`boleta`) REFERENCES `Boleta` (`idBoleta`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_venta_cliente` FOREIGN KEY (`clienteInvolucrado`) REFERENCES `Cliente` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `r_venta_trabajador` FOREIGN KEY (`trabajadorInvolucrado`) REFERENCES `Trabajador` (`rut`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `Venta_Libro`
--
ALTER TABLE `Venta_Libro`
  ADD CONSTRAINT `r_libro_venta` FOREIGN KEY (`libro`) REFERENCES `Libro` (`numeroSerie`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `r_venta_libro` FOREIGN KEY (`venta`) REFERENCES `Venta` (`idVenta`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
