 p a c k a g e   c o m . a d a m . s e r v l e t ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 i m p o r t   c o m . a d a m . p o j o . F l o w e r ;  
 i m p o r t   c o m . a d a m . s e r v i c e . F l o w e r S e r v i c e ;  
 i m p o r t   c o m . a d a m . s e r v i c e . i m p l . F l o w e r S e r v i c e I m p l ;  
  
  
 @ W e b S e r v l e t ( " / s h o w " )  
 p u b l i c   c l a s s   S h o w S e r v l e t   e x t e n d s   H t t p S e r v l e t   {  
 	 p r i v a t e   F l o w e r S e r v i c e   f l o w e r S e r v i c e   =   n e w   F l o w e r S e r v i c e I m p l ( ) ;  
 	 @ O v e r r i d e  
 	 p r o t e c t e d   v o i d   s e r v i c e ( H t t p S e r v l e t R e q u e s t   r e q ,   H t t p S e r v l e t R e s p o n s e   r e s )   t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 L i s t < F l o w e r >   l i s t   =   f l o w e r S e r v i c e . s h o w ( ) ;  
 	 	 r e q . s e t A t t r i b u t e ( " l i s t " ,   l i s t ) ;  
 	 	 r e q . g e t R e q u e s t D i s p a t c h e r ( " i n d e x . j s p " ) . f o r w a r d ( r e q ,   r e s ) ;  
 	 }  
  
 }  
