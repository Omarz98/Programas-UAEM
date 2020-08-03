M = imread('ajedrez.jpg');
%imshow(M)
%M(48,150);
[r,c]=size(M);
for i=1-r
  for j=1-c
    P(i,j)=255-M(i,j);  
  end
end

toc
subplot(1,1,1)
imshow(M)
subplot(1,1,2)
imshow(p)
%vectorizar
tic
P(i,j)=255-M(i,j);  