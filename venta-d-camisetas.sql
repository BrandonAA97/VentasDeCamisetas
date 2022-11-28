-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2022 a las 04:08:52
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `venta-d-camisetas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camisetas`
--

CREATE TABLE `camisetas` (
  `id` int(10) UNSIGNED NOT NULL,
  `club` varchar(15) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `precio` int(15) UNSIGNED NOT NULL,
  `stock` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `camisetas`
--

INSERT INTO `camisetas` (`id`, `club`, `tipo`, `precio`, `stock`) VALUES
(1, 'Boca Juniors', 'Titular', 16999, 120),
(2, 'Boca Juniors', 'Visitante', 16999, 120),
(3, 'Independiente', 'Titular', 15999, 100),
(4, 'Independiente', 'Visitante', 15999, 100),
(5, 'River Plate', 'Titular', 16999, 120),
(6, 'River Plate', 'Visitante', 16999, 120),
(7, 'Racing', 'Titular', 14700, 90),
(8, 'Racing', 'Visitante', 14700, 90),
(9, 'San Lorenzo', 'Titular', 16999, 100),
(10, 'San Lorenzo', 'Visitante', 16999, 100);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `camisetas`
--
ALTER TABLE `camisetas`
  ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `camisetas`
--
ALTER TABLE `camisetas`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
