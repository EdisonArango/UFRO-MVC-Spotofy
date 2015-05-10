create table Cancion(id int(10) not null auto_increment,nombre varchar(100),artista varchar(100),genero varchar(100),primary key (id));
create table Playlist(id int(10) not null auto_increment,nombre varchar(100),primary key (id));
create table Playlist_Cancion(idPlaylist int(10) not null,idCancion int(10) not null,primary key (idPlaylist,idCancion));
alter table Playlist_Cancion add index fkPlaylist (idPlaylist), add constraint fkPlaylist foreign key (idPlaylist) references Playlist(id);
alter table Playlist_Cancion add index fkCancion (idCancion), add constraint fkCancion foreign key (idCancion) references Cancion(id);

INSERT INTO `Cancion` (`id`, `nombre`, `artista`, `genero`) VALUES
(1, 'Hero', 'Skillet', 'Alternative-Rock'),
(3, 'Here Without You', '3 doors down', 'Grunge'),
(4, 'Dance with the devil', 'Breaking benjamin', 'Post-Grunge'),
(5, 'I hate everything about you', 'Three days grace', 'Post-Grunge'),
(6, 'Monster', 'Skillet', 'Rock'),
(7, 'Thanks for the memories', 'Fall Out Boy', 'Alternative-Rock'),
(8, 'Not Strong Enough', 'Apocalyptica', 'Alternative-Metal'),
(9, 'War of change', 'Thousand Foot Krutch', 'Alternative-Metal'),
(10, 'From yesterday', '30 Seconds To Mars', 'Pop-Rock'),
(11, 'Save yourself', 'My darkest days', 'Post-Grunge'),
(12, 'Closer to the edge', '30 Seconds To Mars', 'Pop-Rock'),
(13, 'Breathing', 'Yellowcard', 'Punk-Rock'),
(14, 'Beat it', 'Michael Jackson', 'Pop-Rock'),
(15, 'So cold', 'Breaking benjamin', 'Post-Grunge'),
(16, 'Never to late', 'Three days grace', 'Post-Grunge'),
(17, 'The diary of jane', 'Breaking benjamin', 'Post-Grunge'),
(18, 'Blow me away', 'Breaking benjamin', 'Post-Grunge');
