M = imread('ajedrez.jpg');
imshow(M)
[r,c]=size(M);
tic
i=1:r
  j=1:c;
    P(i,j)=255-M(i,j);  


toc
subplot(1,2,1)
imshow(M)
subplot(1,2,2)
imshow(P)
