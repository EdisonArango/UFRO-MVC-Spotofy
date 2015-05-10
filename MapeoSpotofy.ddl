create table Playlist (id int(10) not null, nombre varchar(100), primary key (id)) type=InnoDB;
create table Cancion (id int(10) not null, nombre varchar(100), artista varchar(100), genero varchar(100), primary key (id)) type=InnoDB;
create table Playlist_Cancion (idPlaylist int(10) not null, idCancion int(10) not null, primary key (idPlaylist, idCancion)) type=InnoDB;
alter table Playlist_Cancion add index FKPlaylist_C871193 (idPlaylist), add constraint FKPlaylist_C871193 foreign key (idPlaylist) references Playlist (id);
alter table Playlist_Cancion add index FKPlaylist_C467281 (idCancion), add constraint FKPlaylist_C467281 foreign key (idCancion) references Cancion (id);
