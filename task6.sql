-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 19 Ağu 2021, 02:42:27
-- Sunucu sürümü: 10.4.19-MariaDB
-- PHP Sürümü: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `task6`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici`
--

CREATE TABLE `kullanici` (
  `id` int(11) NOT NULL,
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text COLLATE utf8_turkish_ci NOT NULL,
  `mail` text COLLATE utf8_turkish_ci NOT NULL,
  `sifre` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanici`
--

INSERT INTO `kullanici` (`id`, `ad`, `soyad`, `mail`, `sifre`) VALUES
(2, 'Hasan', 'Çolak', 'hasan@gmail.com', '1234');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `proje`
--

CREATE TABLE `proje` (
  `id` int(11) NOT NULL,
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `kullaniciId` int(11) NOT NULL,
  `durum` text COLLATE utf8_turkish_ci NOT NULL,
  `musteriAd` text COLLATE utf8_turkish_ci NOT NULL,
  `ilgiliKisi` text COLLATE utf8_turkish_ci NOT NULL,
  `ilgiliTelefon` text COLLATE utf8_turkish_ci NOT NULL,
  `musteriAdres` text COLLATE utf8_turkish_ci NOT NULL,
  `platform` text COLLATE utf8_turkish_ci NOT NULL,
  `teslimTarih` text COLLATE utf8_turkish_ci NOT NULL,
  `teknolojiler` text COLLATE utf8_turkish_ci NOT NULL,
  `alanAdiKayit` text COLLATE utf8_turkish_ci NOT NULL,
  `sunucuKayit` text COLLATE utf8_turkish_ci NOT NULL,
  `sunucuIp` text COLLATE utf8_turkish_ci NOT NULL,
  `sunucuPanelAdres` text COLLATE utf8_turkish_ci NOT NULL,
  `sunucuKullaniciAd` text COLLATE utf8_turkish_ci NOT NULL,
  `sunucuSifre` text COLLATE utf8_turkish_ci NOT NULL,
  `webPanelKullanici` text COLLATE utf8_turkish_ci NOT NULL,
  `webPanelSifre` text COLLATE utf8_turkish_ci NOT NULL,
  `mailSunucuKayit` text COLLATE utf8_turkish_ci NOT NULL,
  `mailBilgi` text COLLATE utf8_turkish_ci NOT NULL,
  `projeDetay` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `proje`
--

INSERT INTO `proje` (`id`, `ad`, `kullaniciId`, `durum`, `musteriAd`, `ilgiliKisi`, `ilgiliTelefon`, `musteriAdres`, `platform`, `teslimTarih`, `teknolojiler`, `alanAdiKayit`, `sunucuKayit`, `sunucuIp`, `sunucuPanelAdres`, `sunucuKullaniciAd`, `sunucuSifre`, `webPanelKullanici`, `webPanelSifre`, `mailSunucuKayit`, `mailBilgi`, `projeDetay`) VALUES
(34, 'Parti Mobil Uygulama ve Web Yönetim Paneli Yazılım Geliştirme', 2, 'Aktif', 'Parti Sakarya İl Başkanlığı', 'Ömer Şahin (Parti Başkanı)', '0532 775 54 86', 'Semerciler Mh. Atatürk Bulvarı Adapazarı/Sakarya', 'Web, Android, Ios', '30.08.2021', 'PHP, Mysql, Javascript, HTML, CSS, Bootstrap 5, Material Design, React Native', 'Godaddy', 'Digital Ocean', '123.12.23.13', 'https://123.12.23.13/plesk', 'admin', '123456', 'admin', '123456', 'Yandex / ekonsoft', '(Uzun Metin, Mail adresleri ve şifreleri)', '(Uzun Metin, Projeye ait diğer bilgiler)');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanici`
--
ALTER TABLE `kullanici`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `proje`
--
ALTER TABLE `proje`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_key` (`kullaniciId`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanici`
--
ALTER TABLE `kullanici`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Tablo için AUTO_INCREMENT değeri `proje`
--
ALTER TABLE `proje`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `proje`
--
ALTER TABLE `proje`
  ADD CONSTRAINT `id_key` FOREIGN KEY (`kullaniciId`) REFERENCES `kullanici` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
