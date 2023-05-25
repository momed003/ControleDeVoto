-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 25-Maio-2023 às 21:49
-- Versão do servidor: 10.10.2-MariaDB
-- versão do PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `municipios`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `candidato`
--

DROP TABLE IF EXISTS `candidato`;
CREATE TABLE IF NOT EXISTS `candidato` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `bi` varchar(30) DEFAULT NULL,
  `historico` varchar(1000) NOT NULL,
  `codigo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `codigo` (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `candidato`
--

INSERT INTO `candidato` (`id`, `nome`, `bi`, `historico`, `codigo`) VALUES
(16, 'Marino Ricardo ', '110258525p', 'luta', 'Maputo'),
(15, 'teste014', '9822', 'asdvh', 'beira');

-- --------------------------------------------------------

--
-- Estrutura da tabela `municipio`
--

DROP TABLE IF EXISTS `municipio`;
CREATE TABLE IF NOT EXISTS `municipio` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `provincia` varchar(50) NOT NULL,
  `descricao` varchar(1000) NOT NULL,
  `qtdRessenciados` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Extraindo dados da tabela `municipio`
--

INSERT INTO `municipio` (`id`, `provincia`, `descricao`, `qtdRessenciados`) VALUES
(1, 'Maputo', 'cidade das acacias', 15800),
(2, 'Inhambane', 'Terra de Boa gente', 1000000),
(3, 'Gaza', 'pontos turisticos', 159872),
(4, 'beira', 'ciclones', 2587103),
(5, 'Nampula', 'ilha de mocambique', 3625841),
(6, 'Cabo-delgado', 'praia do wimbe', 9857125),
(7, 'Zambezia', 'lagos', 822224);

-- --------------------------------------------------------

--
-- Estrutura da tabela `voto`
--

DROP TABLE IF EXISTS `voto`;
CREATE TABLE IF NOT EXISTS `voto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isBranco` int(11) DEFAULT NULL,
  `isValido` int(11) DEFAULT NULL,
  `dataVoto` date DEFAULT NULL,
  `id_candidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_candidato` (`id_candidato`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
