PGDMP     !    	                }            valorantconfigs %   14.15 (Ubuntu 14.15-0ubuntu0.22.04.1) %   14.15 (Ubuntu 14.15-0ubuntu0.22.04.1)     L           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            M           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            N           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            O           1262    16392    valorantconfigs    DATABASE     d   CREATE DATABASE valorantconfigs WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'es_MX.UTF-8';
    DROP DATABASE valorantconfigs;
                postgres    false            �            1259    16398 	   crosshair    TABLE     n   CREATE TABLE public.crosshair (
    crosshairid integer NOT NULL,
    crosshaircode character varying(150)
);
    DROP TABLE public.crosshair;
       public         heap    postgres    false            �            1259    16393    player    TABLE     �   CREATE TABLE public.player (
    playerid integer NOT NULL,
    username character varying(30),
    gamesensibility double precision,
    mousedpi double precision,
    edpi double precision
);
    DROP TABLE public.player;
       public         heap    postgres    false            �            1259    16429    player_crosshair    TABLE     X   CREATE TABLE public.player_crosshair (
    playerid integer,
    crosshairid integer
);
 $   DROP TABLE public.player_crosshair;
       public         heap    postgres    false            H          0    16398 	   crosshair 
   TABLE DATA           ?   COPY public.crosshair (crosshairid, crosshaircode) FROM stdin;
    public          postgres    false    210   �       G          0    16393    player 
   TABLE DATA           U   COPY public.player (playerid, username, gamesensibility, mousedpi, edpi) FROM stdin;
    public          postgres    false    209          I          0    16429    player_crosshair 
   TABLE DATA           A   COPY public.player_crosshair (playerid, crosshairid) FROM stdin;
    public          postgres    false    211   L       �           2606    16402    crosshair crosshair_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.crosshair
    ADD CONSTRAINT crosshair_pkey PRIMARY KEY (crosshairid);
 B   ALTER TABLE ONLY public.crosshair DROP CONSTRAINT crosshair_pkey;
       public            postgres    false    210            �           2606    16397    player player_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.player
    ADD CONSTRAINT player_pkey PRIMARY KEY (playerid);
 <   ALTER TABLE ONLY public.player DROP CONSTRAINT player_pkey;
       public            postgres    false    209            �           2606    16437    player_crosshair fk_crosshairid    FK CONSTRAINT     �   ALTER TABLE ONLY public.player_crosshair
    ADD CONSTRAINT fk_crosshairid FOREIGN KEY (crosshairid) REFERENCES public.crosshair(crosshairid);
 I   ALTER TABLE ONLY public.player_crosshair DROP CONSTRAINT fk_crosshairid;
       public          postgres    false    3257    211    210            �           2606    16432    player_crosshair fk_playerid    FK CONSTRAINT     �   ALTER TABLE ONLY public.player_crosshair
    ADD CONSTRAINT fk_playerid FOREIGN KEY (playerid) REFERENCES public.player(playerid);
 F   ALTER TABLE ONLY public.player_crosshair DROP CONSTRAINT fk_playerid;
       public          postgres    false    3255    209    211            H      x������ � �      G   '   x�3�tOL�N,-���4�327�4400�2�b���� �)Q      I      x������ � �     