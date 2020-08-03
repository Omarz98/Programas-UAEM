clear all
M = imread('box.jpg');

A=70-M;
O=M-70;

subplot(1,3,1);
imshow(A)
subplot(1,3,2)
imshow(M)
subplot(1,3,3)
imshow(O)
