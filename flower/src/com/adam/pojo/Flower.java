 p a c k a g e   c o m . a d a m . p o j o ;  
  
 p u b l i c   c l a s s   F l o w e r   {  
 	 p r i v a t e   i n t   i d ;  
 	 p r i v a t e   S t r i n g   n a m e ;  
 	 p r i v a t e   d o u b l e   p r i c e ;  
 	 p r i v a t e   S t r i n g   p r o d u c t i o n ;  
 	  
 	 p u b l i c   F l o w e r ( i n t   i d ,   S t r i n g   n a m e ,   d o u b l e   p r i c e ,   S t r i n g   p r o d u c t i o n )   {  
 	 	 s u p e r ( ) ;  
 	 	 t h i s . i d   =   i d ;  
 	 	 t h i s . n a m e   =   n a m e ;  
 	 	 t h i s . p r i c e   =   p r i c e ;  
 	 	 t h i s . p r o d u c t i o n   =   p r o d u c t i o n ;  
 	 }  
 	 p u b l i c   F l o w e r ( )   {  
 	 	 s u p e r ( ) ;  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
 	 p u b l i c   i n t   g e t I d ( )   {  
 	 	 r e t u r n   i d ;  
 	 }  
 	 p u b l i c   v o i d   s e t I d ( i n t   i d )   {  
 	 	 t h i s . i d   =   i d ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t N a m e ( )   {  
 	 	 r e t u r n   n a m e ;  
 	 }  
 	 p u b l i c   v o i d   s e t N a m e ( S t r i n g   n a m e )   {  
 	 	 t h i s . n a m e   =   n a m e ;  
 	 }  
 	 p u b l i c   d o u b l e   g e t P r i c e ( )   {  
 	 	 r e t u r n   p r i c e ;  
 	 }  
 	 p u b l i c   v o i d   s e t P r i c e ( d o u b l e   p r i c e )   {  
 	 	 t h i s . p r i c e   =   p r i c e ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t P r o d u c t i o n ( )   {  
 	 	 r e t u r n   p r o d u c t i o n ;  
 	 }  
 	 p u b l i c   v o i d   s e t P r o d u c t i o n ( S t r i n g   p r o d u c t i o n )   {  
 	 	 t h i s . p r o d u c t i o n   =   p r o d u c t i o n ;  
 	 }  
 	  
 }  
