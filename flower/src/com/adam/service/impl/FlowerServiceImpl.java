 p a c k a g e   c o m . a d a m . s e r v i c e . i m p l ;  
  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   c o m . a d a m . d a o . F l o w e r D a o ;  
 i m p o r t   c o m . a d a m . d a o . i m p l . F l o w e r D a o I m p l ;  
 i m p o r t   c o m . a d a m . p o j o . F l o w e r ;  
 i m p o r t   c o m . a d a m . s e r v i c e . F l o w e r S e r v i c e ;  
  
 p u b l i c   c l a s s   F l o w e r S e r v i c e I m p l   i m p l e m e n t s   F l o w e r S e r v i c e   {  
 	 p r i v a t e   F l o w e r D a o   f l o w e r D a o   =   n e w   F l o w e r D a o I m p l ( ) ;  
  
 	 @ O v e r r i d e  
 	 p u b l i c   L i s t < F l o w e r >   s h o w ( )   {  
  
 	 	 r e t u r n   f l o w e r D a o . s e l A l l ( ) ;  
 	 }  
  
 }  
