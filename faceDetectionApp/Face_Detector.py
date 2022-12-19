import cv2

#Load pre-trained data on face frontals from opencv
trained_face_data = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')

#saves image
webcam = cv2.VideoCapture(0)

while True:

    read_frame, frame = webcam.read()
    grayscale_img = cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY)

    faces_cords = trained_face_data.detectMultiScale(grayscale_img)


    for (x, y, w, h) in faces_cords:

        cv2.rectangle(frame, (x, y), (x+w, y+h), (0,255,0), 2)


    cv2.imshow('Face Detector',frame)
    key = cv2.waitKey(1)
    if key == 81 or key ==113:
        break

print("Code Completed")
