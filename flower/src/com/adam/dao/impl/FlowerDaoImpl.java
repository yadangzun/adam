 p a c k a g e   c o m . a d a m . d a o . i m p l ;  
  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . D r i v e r M a n a g e r ;  
 i m p o r t   j a v a . s q l . P r e p a r e d S t a t e m e n t ;  
 i m p o r t   j a v a . s q l . R e s u l t S e t ;  
 i m p o r t   j a v a . s q l . S Q L E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   c o m . a d a m . d a o . F l o w e r D a o ;  
 i m p o r t   c o m . a d a m . p o j o . F l o w e r ;  
  
  
 p u b l i c   c l a s s   F l o w e r D a o I m p l   i m p l e m e n t s   F l o w e r D a o   {  
  
 	 @ O v e r r i d e  
 	 p u b l i c   L i s t < F l o w e r >   s e l A l l ( )   {  
 	 	 L i s t < F l o w e r >   l i s t   =   n e w   A r r a y L i s t < F l o w e r > ( ) ;  
 	 	 C o n n e c t i o n   c o n n   =   n u l l ;  
 	 	 P r e p a r e d S t a t e m e n t   p s   =   n u l l ;  
 	 	 R e s u l t S e t   r s   =   n u l l ;  
 	 	 t r y   {  
 	 	 	 C l a s s . f o r N a m e ( " c o m . m y s q l . c j . j d b c . D r i v e r " ) ;  
 	 	 	 c o n n   =   D r i v e r M a n a g e r . g e t C o n n e c t i o n ( " j d b c : m y s q l : / / l o c a l h o s t : 3 3 0 6 / s s m ? "  
 	 	 	 	 	 +   " u s e U n i c o d e = t r u e & c h a r a c t e r E n c o d i n g = U T F 8 & u s e S S L = f a l s e "  
 	 	 	 	 	 +   " & s e r v e r T i m e z o n e = G M T & a l l o w P u b l i c K e y R e t r i e v a l = t r u e " , " l u o x i a n " , " l u o x i a n " ) ;  
 	 	 	 p s   =   c o n n . p r e p a r e S t a t e m e n t ( " s e l e c t   *   f r o m   f l o w e r " ) ;  
 	 	 	 r s   =   p s . e x e c u t e Q u e r y ( ) ;  
 	 	 	  
 	 	 	 w h i l e ( r s . n e x t ( ) )   {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( r s . g e t S t r i n g ( 4 ) ) ;  
 	 	 	 	 l i s t . a d d ( n e w   F l o w e r ( r s . g e t I n t ( 1 ) ,   r s . g e t S t r i n g ( 2 ) ,   r s . g e t D o u b l e ( 3 ) ,   r s . g e t S t r i n g ( 4 ) ) ) ;  
 	 	 	 }  
 	 	 	  
 	 	 }   c a t c h   ( C l a s s N o t F o u n d E x c e p t i o n   e )   {  
 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } f i n a l l y   {  
 	 	 	 t r y   {  
 	 	 	 	 r s . c l o s e ( ) ;  
 	 	 	 	 p s . c l o s e ( ) ;  
 	 	 	 	 c o n n . c l o s e ( ) ;  
 	 	 	 }   c a t c h   ( S Q L E x c e p t i o n   e )   {  
 	 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
  
 	 	 r e t u r n   l i s t ;  
 	 }  
  
 }  
